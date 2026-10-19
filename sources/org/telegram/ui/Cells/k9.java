package org.telegram.ui.Cells;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.Components.s41;
import org.telegram.ui.r21;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class k9 implements ActionMode.Callback {
    public String a = null;
    public final /* synthetic */ aa b;

    public k9(aa aaVar) {
        this.b = aaVar;
    }

    public final void a(Menu menu) {
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((this.b.k0 == null || ((this.a == null || r21.Y().contains(this.a)) && LanguageDetector.hasSupport())) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence s10;
        aa aaVar = this.b;
        g gVar = aaVar.m0;
        if (aaVar.x()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                if (aaVar.x()) {
                    if (!aaVar.C()) {
                        CharSequence r10 = aaVar.r();
                        if (r10 != null) {
                            AndroidUtilities.addToClipboard(r10);
                        }
                    }
                    aaVar.u();
                    aaVar.f(true);
                    w7.j0 j0Var = aaVar.D;
                    if (j0Var != null) {
                        j0Var.b();
                        return true;
                    }
                }
            } else {
                if (itemId != 16908319) {
                    if (itemId == 3) {
                        if (aaVar.k0 != null) {
                            String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                            org.telegram.ui.t tVar = aaVar.k0;
                            CharSequence r11 = aaVar.r();
                            String str = this.a;
                            g gVar2 = new g(this, 8);
                            org.telegram.ui.l4 l4Var = tVar.a;
                            s41.L(l4Var.L, l4Var.M, str, language, r11, null, gVar2);
                        }
                        aaVar.u();
                        return true;
                    }
                    if (itemId == R.id.menu_quote) {
                        if (aaVar.x()) {
                            v9 v9Var = aaVar.W;
                            MessageObject messageObject = v9Var instanceof u1 ? ((u1) v9Var).getMessageObject() : null;
                            if (messageObject != null && aaVar.r() != null) {
                                aaVar.I(messageObject, aaVar.u, aaVar.v);
                                aaVar.f(true);
                            }
                        }
                        aaVar.u();
                        return true;
                    }
                    if (itemId == 16908320) {
                        aaVar.D();
                        aaVar.u();
                        return true;
                    }
                    if (itemId != 16908322) {
                        aaVar.f(false);
                        return true;
                    }
                    aaVar.H();
                    aaVar.u();
                    return true;
                }
                if (!aaVar.J() && (s10 = aaVar.s(aaVar.W, false)) != null) {
                    aaVar.u = 0;
                    aaVar.v = s10.length();
                    aaVar.u();
                    aaVar.w();
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        menu.add(0, android.R.id.copy, 0, android.R.string.copy);
        menu.add(0, R.id.menu_quote, 1, LocaleController.getString(R.string.Quote));
        menu.add(0, 3, 2, LocaleController.getString(R.string.TranslateMessage));
        menu.add(0, android.R.id.cut, 3, android.R.string.cut);
        menu.add(0, android.R.id.paste, 4, android.R.string.paste);
        menu.add(0, android.R.id.selectAll, 5, android.R.string.selectAll);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        ClipboardManager clipboardManager;
        aa aaVar;
        v9 v9Var;
        MenuItem findItem = menu.findItem(R.id.menu_quote);
        if (findItem != null) {
            findItem.setVisible(this.b.e());
        }
        MenuItem findItem2 = menu.findItem(android.R.id.copy);
        if (findItem2 != null) {
            findItem2.setVisible(this.b.b());
        }
        MenuItem findItem3 = menu.findItem(android.R.id.selectAll);
        boolean z10 = false;
        if (findItem3 != null && (v9Var = (aaVar = this.b).W) != null) {
            CharSequence s10 = aaVar.s(v9Var, false);
            if (!this.b.b()) {
                findItem3.setVisible(false);
            } else if (this.b.j()) {
                findItem3.setVisible(true);
            } else {
                aa aaVar2 = this.b;
                if (aaVar2.Z || (aaVar2.u <= 0 && aaVar2.v >= s10.length() - 1)) {
                    findItem3.setVisible(false);
                } else {
                    findItem3.setVisible(true);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(android.R.id.cut);
        if (findItem4 != null) {
            findItem4.setVisible(this.b instanceof ki.j3);
        }
        MenuItem findItem5 = menu.findItem(android.R.id.paste);
        if (findItem5 != null) {
            aa aaVar3 = this.b;
            if (aaVar3 instanceof ki.j3) {
                try {
                    z9 z9Var = aaVar3.C;
                    Context context = z9Var != null ? z9Var.getContext() : ApplicationLoader.applicationContext;
                    if (context != null && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null) {
                        if (clipboardManager.hasPrimaryClip()) {
                            z10 = true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            findItem5.setVisible(z10);
        }
        if (this.b.k0 == null || !LanguageDetector.hasSupport() || this.b.r() == null) {
            this.a = null;
            a(menu);
        } else {
            LanguageDetector.detectLanguage(this.b.r().toString(), new j9(this, menu), new j9(this, menu));
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}

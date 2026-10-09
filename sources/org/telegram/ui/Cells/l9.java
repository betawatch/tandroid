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
import org.telegram.ui.Components.b51;
import org.telegram.ui.f41;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l9 implements ActionMode.Callback {
    public String a = null;
    public final /* synthetic */ ba b;

    public l9(ba baVar) {
        this.b = baVar;
    }

    public final void a(Menu menu) {
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((this.b.k0 == null || ((this.a == null || f41.Y().contains(this.a)) && LanguageDetector.hasSupport())) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence s10;
        ba baVar = this.b;
        g gVar = baVar.m0;
        if (baVar.x()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                if (baVar.x()) {
                    if (!baVar.C()) {
                        CharSequence r10 = baVar.r();
                        if (r10 != null) {
                            AndroidUtilities.addToClipboard(r10);
                        }
                    }
                    baVar.u();
                    baVar.f(true);
                    w7.h0 h0Var = baVar.D;
                    if (h0Var != null) {
                        h0Var.b();
                        return true;
                    }
                }
            } else {
                if (itemId != 16908319) {
                    if (itemId == 3) {
                        if (baVar.k0 != null) {
                            String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                            org.telegram.ui.u uVar = baVar.k0;
                            CharSequence r11 = baVar.r();
                            String str = this.a;
                            g gVar2 = new g(this, 8);
                            org.telegram.ui.i4 i4Var = uVar.a;
                            b51.L(i4Var.L, i4Var.M, str, language, r11, null, gVar2);
                        }
                        baVar.u();
                        return true;
                    }
                    if (itemId == R.id.menu_quote) {
                        if (baVar.x()) {
                            w9 w9Var = baVar.W;
                            MessageObject messageObject = w9Var instanceof u1 ? ((u1) w9Var).getMessageObject() : null;
                            if (messageObject != null && baVar.r() != null) {
                                baVar.I(baVar.u, baVar.v, messageObject);
                                baVar.f(true);
                            }
                        }
                        baVar.u();
                        return true;
                    }
                    if (itemId == 16908320) {
                        baVar.D();
                        baVar.u();
                        return true;
                    }
                    if (itemId != 16908322) {
                        baVar.f(false);
                        return true;
                    }
                    baVar.H();
                    baVar.u();
                    return true;
                }
                if (!baVar.J() && (s10 = baVar.s(baVar.W, false)) != null) {
                    baVar.u = 0;
                    baVar.v = s10.length();
                    baVar.u();
                    baVar.w();
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
        ba baVar;
        w9 w9Var;
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
        if (findItem3 != null && (w9Var = (baVar = this.b).W) != null) {
            CharSequence s10 = baVar.s(w9Var, false);
            if (!this.b.b()) {
                findItem3.setVisible(false);
            } else if (this.b.j()) {
                findItem3.setVisible(true);
            } else {
                ba baVar2 = this.b;
                if (baVar2.Z || (baVar2.u <= 0 && baVar2.v >= s10.length() - 1)) {
                    findItem3.setVisible(false);
                } else {
                    findItem3.setVisible(true);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(android.R.id.cut);
        if (findItem4 != null) {
            findItem4.setVisible(this.b instanceof ii.k3);
        }
        MenuItem findItem5 = menu.findItem(android.R.id.paste);
        if (findItem5 != null) {
            ba baVar3 = this.b;
            if (baVar3 instanceof ii.k3) {
                try {
                    aa aaVar = baVar3.C;
                    Context context = aaVar != null ? aaVar.getContext() : ApplicationLoader.applicationContext;
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
            LanguageDetector.detectLanguage(this.b.r().toString(), new k9(this, menu), new k9(this, menu));
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}

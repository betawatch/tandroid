package org.telegram.ui.Cells;

import a8.ye;
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
import org.telegram.ui.Components.g51;
import org.telegram.ui.a31;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p9 implements ActionMode.Callback {
    public String a = null;
    public final /* synthetic */ fa b;

    public p9(fa faVar) {
        this.b = faVar;
    }

    public final void a(Menu menu) {
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((this.b.k0 == null || ((this.a == null || a31.Z().contains(this.a)) && LanguageDetector.hasSupport())) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence s10;
        fa faVar = this.b;
        g gVar = faVar.m0;
        if (faVar.x()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                if (faVar.x() && faVar.b()) {
                    if (!faVar.C()) {
                        CharSequence r6 = faVar.r();
                        if (r6 != null) {
                            AndroidUtilities.addToClipboard(r6);
                        }
                    }
                    faVar.u();
                    faVar.f(true);
                    ye yeVar = faVar.D;
                    if (yeVar != null) {
                        yeVar.b();
                        return true;
                    }
                }
            } else {
                if (itemId != 16908319) {
                    if (itemId == 3) {
                        if (faVar.k0 != null) {
                            String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                            org.telegram.ui.s sVar = faVar.k0;
                            CharSequence r10 = faVar.r();
                            String str = this.a;
                            g gVar2 = new g(this, 8);
                            org.telegram.ui.j4 j4Var = sVar.a;
                            g51.T(j4Var.L, j4Var.M, str, language, r10, null, gVar2);
                        }
                        faVar.u();
                        return true;
                    }
                    if (itemId == R.id.menu_quote) {
                        if (faVar.x()) {
                            aa aaVar = faVar.W;
                            MessageObject messageObject = aaVar instanceof s1 ? ((s1) aaVar).getMessageObject() : null;
                            if (messageObject != null && faVar.r() != null) {
                                faVar.I(messageObject, faVar.u, faVar.v);
                                faVar.f(true);
                            }
                        }
                        faVar.u();
                        return true;
                    }
                    if (itemId == 16908320) {
                        faVar.D();
                        faVar.u();
                        return true;
                    }
                    if (itemId != 16908322) {
                        faVar.f(false);
                        return true;
                    }
                    faVar.H();
                    faVar.u();
                    return true;
                }
                if (!faVar.J() && (s10 = faVar.s(faVar.W, false)) != null) {
                    faVar.u = 0;
                    faVar.v = s10.length();
                    faVar.u();
                    faVar.w();
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
        fa faVar;
        aa aaVar;
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
        if (findItem3 != null && (aaVar = (faVar = this.b).W) != null) {
            CharSequence s10 = faVar.s(aaVar, false);
            if (!this.b.b()) {
                findItem3.setVisible(false);
            } else if (this.b.j()) {
                findItem3.setVisible(true);
            } else {
                fa faVar2 = this.b;
                if (faVar2.Z || (faVar2.u <= 0 && faVar2.v >= s10.length() - 1)) {
                    findItem3.setVisible(false);
                } else {
                    findItem3.setVisible(true);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(android.R.id.cut);
        if (findItem4 != null) {
            findItem4.setVisible(this.b instanceof li.j3);
        }
        MenuItem findItem5 = menu.findItem(android.R.id.paste);
        if (findItem5 != null) {
            fa faVar3 = this.b;
            if (faVar3 instanceof li.j3) {
                try {
                    ea eaVar = faVar3.C;
                    Context context = eaVar != null ? eaVar.getContext() : ApplicationLoader.applicationContext;
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
            LanguageDetector.detectLanguage(this.b.r().toString(), new o9(this, menu), new o9(this, menu));
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}

package org.telegram.ui.Cells;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i41;
import org.telegram.ui.k41;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        findItem.setVisible((this.b.l0 == null || ((this.a == null || k41.Y().contains(this.a)) && LanguageDetector.hasSupport())) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence t10;
        fa faVar = this.b;
        g gVar = faVar.r0;
        if (faVar.y()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                faVar.g();
                return true;
            }
            if (itemId != 16908319) {
                if (itemId == 3) {
                    if (faVar.l0 != null) {
                        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                        org.telegram.ui.u uVar = faVar.l0;
                        CharSequence s10 = faVar.s();
                        String str = this.a;
                        g gVar2 = new g(this, 8);
                        org.telegram.ui.j4 j4Var = uVar.a;
                        i41.K(j4Var.L, j4Var.M, str, language, s10, null, gVar2);
                    }
                    faVar.v();
                    return true;
                }
                if (itemId == R.id.menu_quote) {
                    if (faVar.y()) {
                        aa aaVar = faVar.W;
                        MessageObject messageObject = aaVar instanceof t1 ? ((t1) aaVar).getMessageObject() : null;
                        if (messageObject != null && faVar.s() != null) {
                            faVar.J(faVar.u, faVar.v, messageObject);
                            faVar.f(true);
                        }
                    }
                    faVar.v();
                    return true;
                }
                if (itemId == 16908320) {
                    faVar.E();
                    faVar.v();
                    return true;
                }
                if (itemId != 16908322) {
                    faVar.f(false);
                    return true;
                }
                faVar.I();
                faVar.v();
                return true;
            }
            if (!faVar.K() && (t10 = faVar.t(faVar.W, false)) != null) {
                faVar.u = 0;
                faVar.v = t10.length();
                faVar.v();
                faVar.x();
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
                return true;
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
    public final void onDestroyActionMode(ActionMode actionMode) {
        if (Build.VERSION.SDK_INT < 23) {
            this.b.f(false);
        }
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
            CharSequence t10 = faVar.t(aaVar, false);
            if (!this.b.b()) {
                findItem3.setVisible(false);
            } else if (this.b.k()) {
                findItem3.setVisible(true);
            } else {
                fa faVar2 = this.b;
                if (faVar2.Z || (faVar2.u <= 0 && faVar2.v >= t10.length() - 1)) {
                    findItem3.setVisible(false);
                } else {
                    findItem3.setVisible(true);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(android.R.id.cut);
        if (findItem4 != null) {
            findItem4.setVisible(this.b instanceof hi.m3);
        }
        MenuItem findItem5 = menu.findItem(android.R.id.paste);
        if (findItem5 != null) {
            fa faVar3 = this.b;
            if (faVar3 instanceof hi.m3) {
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
        if (this.b.l0 == null || !LanguageDetector.hasSupport() || this.b.s() == null) {
            this.a = null;
            a(menu);
        } else {
            LanguageDetector.detectLanguage(this.b.s().toString(), new o9(this, menu), new o9(this, menu));
        }
        return true;
    }
}

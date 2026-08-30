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
import org.telegram.ui.Components.v31;
import org.telegram.ui.n31;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j9 implements ActionMode.Callback {
    public String a = null;
    public final /* synthetic */ z9 b;

    public j9(z9 z9Var) {
        this.b = z9Var;
    }

    public final void a(Menu menu) {
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((this.b.l0 == null || ((this.a == null || n31.Y().contains(this.a)) && LanguageDetector.hasSupport())) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence t6;
        z9 z9Var = this.b;
        g gVar = z9Var.r0;
        if (z9Var.y()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                z9Var.g();
                return true;
            }
            if (itemId != 16908319) {
                if (itemId == 3) {
                    if (z9Var.l0 != null) {
                        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                        org.telegram.ui.v vVar = z9Var.l0;
                        CharSequence s6 = z9Var.s();
                        String str = this.a;
                        g gVar2 = new g(this, 8);
                        org.telegram.ui.l4 l4Var = vVar.a;
                        v31.J(l4Var.I, l4Var.J, str, language, s6, null, gVar2);
                    }
                    z9Var.v();
                    return true;
                }
                if (itemId == R.id.menu_quote) {
                    if (z9Var.y()) {
                        u9 u9Var = z9Var.W;
                        MessageObject messageObject = u9Var instanceof t1 ? ((t1) u9Var).getMessageObject() : null;
                        if (messageObject != null && z9Var.s() != null) {
                            z9Var.J(z9Var.u, z9Var.v, messageObject);
                            z9Var.f(true);
                        }
                    }
                    z9Var.v();
                    return true;
                }
                if (itemId == 16908320) {
                    z9Var.E();
                    z9Var.v();
                    return true;
                }
                if (itemId != 16908322) {
                    z9Var.f(false);
                    return true;
                }
                z9Var.I();
                z9Var.v();
                return true;
            }
            if (!z9Var.K() && (t6 = z9Var.t(z9Var.W, false)) != null) {
                z9Var.u = 0;
                z9Var.v = t6.length();
                z9Var.v();
                z9Var.x();
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
        z9 z9Var;
        u9 u9Var;
        MenuItem findItem = menu.findItem(R.id.menu_quote);
        if (findItem != null) {
            findItem.setVisible(this.b.e());
        }
        MenuItem findItem2 = menu.findItem(android.R.id.copy);
        if (findItem2 != null) {
            findItem2.setVisible(this.b.b());
        }
        MenuItem findItem3 = menu.findItem(android.R.id.selectAll);
        boolean z4 = false;
        if (findItem3 != null && (u9Var = (z9Var = this.b).W) != null) {
            CharSequence t6 = z9Var.t(u9Var, false);
            if (!this.b.b()) {
                findItem3.setVisible(false);
            } else if (this.b.k()) {
                findItem3.setVisible(true);
            } else {
                z9 z9Var2 = this.b;
                if (z9Var2.Z || (z9Var2.u <= 0 && z9Var2.v >= t6.length() - 1)) {
                    findItem3.setVisible(false);
                } else {
                    findItem3.setVisible(true);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(android.R.id.cut);
        if (findItem4 != null) {
            findItem4.setVisible(this.b instanceof vh.f3);
        }
        MenuItem findItem5 = menu.findItem(android.R.id.paste);
        if (findItem5 != null) {
            z9 z9Var3 = this.b;
            if (z9Var3 instanceof vh.f3) {
                try {
                    y9 y9Var = z9Var3.C;
                    Context context = y9Var != null ? y9Var.getContext() : ApplicationLoader.applicationContext;
                    if (context != null && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null) {
                        if (clipboardManager.hasPrimaryClip()) {
                            z4 = true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            findItem5.setVisible(z4);
        }
        if (this.b.l0 == null || !LanguageDetector.hasSupport() || this.b.s() == null) {
            this.a = null;
            a(menu);
        } else {
            LanguageDetector.detectLanguage(this.b.s().toString(), new i9(this, menu), new i9(this, menu));
        }
        return true;
    }
}

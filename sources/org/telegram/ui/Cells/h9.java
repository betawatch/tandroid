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
import org.telegram.ui.Components.k31;
import org.telegram.ui.b31;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h9 implements ActionMode.Callback {
    public String a = null;
    public final /* synthetic */ x9 b;

    public h9(x9 x9Var) {
        this.b = x9Var;
    }

    public final void a(Menu menu) {
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((this.b.l0 == null || ((this.a == null || b31.Y().contains(this.a)) && LanguageDetector.hasSupport())) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence t10;
        x9 x9Var = this.b;
        g gVar = x9Var.r0;
        if (x9Var.y()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                x9Var.g();
                return true;
            }
            if (itemId != 16908319) {
                if (itemId == 3) {
                    if (x9Var.l0 != null) {
                        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                        org.telegram.ui.v vVar = x9Var.l0;
                        CharSequence s10 = x9Var.s();
                        String str = this.a;
                        g gVar2 = new g(this, 8);
                        org.telegram.ui.m4 m4Var = vVar.a;
                        k31.J(m4Var.H, m4Var.I, str, language, s10, null, gVar2);
                    }
                    x9Var.v();
                    return true;
                }
                if (itemId == R.id.menu_quote) {
                    if (x9Var.y()) {
                        s9 s9Var = x9Var.W;
                        MessageObject messageObject = s9Var instanceof s1 ? ((s1) s9Var).getMessageObject() : null;
                        if (messageObject != null && x9Var.s() != null) {
                            x9Var.J(x9Var.u, x9Var.v, messageObject);
                            x9Var.f(true);
                        }
                    }
                    x9Var.v();
                    return true;
                }
                if (itemId == 16908320) {
                    x9Var.E();
                    x9Var.v();
                    return true;
                }
                if (itemId != 16908322) {
                    x9Var.f(false);
                    return true;
                }
                x9Var.I();
                x9Var.v();
                return true;
            }
            if (!x9Var.K() && (t10 = x9Var.t(x9Var.W, false)) != null) {
                x9Var.u = 0;
                x9Var.v = t10.length();
                x9Var.v();
                x9Var.x();
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
        x9 x9Var;
        s9 s9Var;
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
        if (findItem3 != null && (s9Var = (x9Var = this.b).W) != null) {
            CharSequence t10 = x9Var.t(s9Var, false);
            if (!this.b.b()) {
                findItem3.setVisible(false);
            } else if (this.b.k()) {
                findItem3.setVisible(true);
            } else {
                x9 x9Var2 = this.b;
                if (x9Var2.Z || (x9Var2.u <= 0 && x9Var2.v >= t10.length() - 1)) {
                    findItem3.setVisible(false);
                } else {
                    findItem3.setVisible(true);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(android.R.id.cut);
        if (findItem4 != null) {
            findItem4.setVisible(this.b instanceof th.d3);
        }
        MenuItem findItem5 = menu.findItem(android.R.id.paste);
        if (findItem5 != null) {
            x9 x9Var3 = this.b;
            if (x9Var3 instanceof th.d3) {
                try {
                    w9 w9Var = x9Var3.C;
                    Context context = w9Var != null ? w9Var.getContext() : ApplicationLoader.applicationContext;
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
            LanguageDetector.detectLanguage(this.b.s().toString(), new g9(this, menu), new g9(this, menu));
        }
        return true;
    }
}

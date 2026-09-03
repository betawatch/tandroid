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
import org.telegram.ui.t31;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i9 implements ActionMode.Callback {
    public String a = null;
    public final /* synthetic */ y9 b;

    public i9(y9 y9Var) {
        this.b = y9Var;
    }

    public final void a(Menu menu) {
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((this.b.l0 == null || ((this.a == null || t31.Y().contains(this.a)) && LanguageDetector.hasSupport())) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence t6;
        y9 y9Var = this.b;
        g gVar = y9Var.r0;
        if (y9Var.y()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                y9Var.g();
                return true;
            }
            if (itemId != 16908319) {
                if (itemId == 3) {
                    if (y9Var.l0 != null) {
                        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                        org.telegram.ui.v vVar = y9Var.l0;
                        CharSequence s6 = y9Var.s();
                        String str = this.a;
                        g gVar2 = new g(this, 8);
                        org.telegram.ui.n4 n4Var = vVar.a;
                        v31.J(n4Var.I, n4Var.J, str, language, s6, null, gVar2);
                    }
                    y9Var.v();
                    return true;
                }
                if (itemId == R.id.menu_quote) {
                    if (y9Var.y()) {
                        t9 t9Var = y9Var.W;
                        MessageObject messageObject = t9Var instanceof s1 ? ((s1) t9Var).getMessageObject() : null;
                        if (messageObject != null && y9Var.s() != null) {
                            y9Var.J(y9Var.u, y9Var.v, messageObject);
                            y9Var.f(true);
                        }
                    }
                    y9Var.v();
                    return true;
                }
                if (itemId == 16908320) {
                    y9Var.E();
                    y9Var.v();
                    return true;
                }
                if (itemId != 16908322) {
                    y9Var.f(false);
                    return true;
                }
                y9Var.I();
                y9Var.v();
                return true;
            }
            if (!y9Var.K() && (t6 = y9Var.t(y9Var.W, false)) != null) {
                y9Var.u = 0;
                y9Var.v = t6.length();
                y9Var.v();
                y9Var.x();
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
        y9 y9Var;
        t9 t9Var;
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
        if (findItem3 != null && (t9Var = (y9Var = this.b).W) != null) {
            CharSequence t6 = y9Var.t(t9Var, false);
            if (!this.b.b()) {
                findItem3.setVisible(false);
            } else if (this.b.k()) {
                findItem3.setVisible(true);
            } else {
                y9 y9Var2 = this.b;
                if (y9Var2.Z || (y9Var2.u <= 0 && y9Var2.v >= t6.length() - 1)) {
                    findItem3.setVisible(false);
                } else {
                    findItem3.setVisible(true);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(android.R.id.cut);
        if (findItem4 != null) {
            findItem4.setVisible(this.b instanceof vh.g3);
        }
        MenuItem findItem5 = menu.findItem(android.R.id.paste);
        if (findItem5 != null) {
            y9 y9Var3 = this.b;
            if (y9Var3 instanceof vh.g3) {
                try {
                    x9 x9Var = y9Var3.C;
                    Context context = x9Var != null ? x9Var.getContext() : ApplicationLoader.applicationContext;
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
            LanguageDetector.detectLanguage(this.b.s().toString(), new h9(this, menu), new h9(this, menu));
        }
        return true;
    }
}

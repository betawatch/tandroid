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
import org.telegram.ui.Components.b31;
import org.telegram.ui.a31;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g9 implements ActionMode.Callback {
    public String a = null;
    public final /* synthetic */ w9 b;

    public g9(w9 w9Var) {
        this.b = w9Var;
    }

    public final void a(Menu menu) {
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((this.b.l0 == null || ((this.a == null || a31.Y().contains(this.a)) && LanguageDetector.hasSupport())) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence t10;
        w9 w9Var = this.b;
        g gVar = w9Var.r0;
        if (w9Var.y()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                w9Var.g();
                return true;
            }
            if (itemId != 16908319) {
                if (itemId == 3) {
                    if (w9Var.l0 != null) {
                        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                        org.telegram.ui.u uVar = w9Var.l0;
                        CharSequence s10 = w9Var.s();
                        String str = this.a;
                        g gVar2 = new g(this, 8);
                        org.telegram.ui.m4 m4Var = uVar.a;
                        b31.K(m4Var.H, m4Var.I, str, language, s10, null, gVar2);
                    }
                    w9Var.v();
                    return true;
                }
                if (itemId == R.id.menu_quote) {
                    if (w9Var.y()) {
                        r9 r9Var = w9Var.W;
                        MessageObject messageObject = r9Var instanceof s1 ? ((s1) r9Var).getMessageObject() : null;
                        if (messageObject != null && w9Var.s() != null) {
                            w9Var.J(w9Var.u, w9Var.v, messageObject);
                            w9Var.f(true);
                        }
                    }
                    w9Var.v();
                    return true;
                }
                if (itemId == 16908320) {
                    w9Var.E();
                    w9Var.v();
                    return true;
                }
                if (itemId != 16908322) {
                    w9Var.f(false);
                    return true;
                }
                w9Var.I();
                w9Var.v();
                return true;
            }
            if (!w9Var.K() && (t10 = w9Var.t(w9Var.W, false)) != null) {
                w9Var.u = 0;
                w9Var.v = t10.length();
                w9Var.v();
                w9Var.x();
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
        w9 w9Var;
        r9 r9Var;
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
        if (findItem3 != null && (r9Var = (w9Var = this.b).W) != null) {
            CharSequence t10 = w9Var.t(r9Var, false);
            if (!this.b.b()) {
                findItem3.setVisible(false);
            } else if (this.b.k()) {
                findItem3.setVisible(true);
            } else {
                w9 w9Var2 = this.b;
                if (w9Var2.Z || (w9Var2.u <= 0 && w9Var2.v >= t10.length() - 1)) {
                    findItem3.setVisible(false);
                } else {
                    findItem3.setVisible(true);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(android.R.id.cut);
        if (findItem4 != null) {
            findItem4.setVisible(this.b instanceof rh.d3);
        }
        MenuItem findItem5 = menu.findItem(android.R.id.paste);
        if (findItem5 != null) {
            w9 w9Var3 = this.b;
            if (w9Var3 instanceof rh.d3) {
                try {
                    v9 v9Var = w9Var3.C;
                    Context context = v9Var != null ? v9Var.getContext() : ApplicationLoader.applicationContext;
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
            LanguageDetector.detectLanguage(this.b.s().toString(), new f9(this, menu), new f9(this, menu));
        }
        return true;
    }
}

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
import org.telegram.ui.Components.u31;
import org.telegram.ui.h41;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class n9 implements ActionMode.Callback {
    public String a = null;
    public final /* synthetic */ da b;

    public n9(da daVar) {
        this.b = daVar;
    }

    public final void a(Menu menu) {
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((this.b.l0 == null || ((this.a == null || h41.Y().contains(this.a)) && LanguageDetector.hasSupport())) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence t10;
        da daVar = this.b;
        g gVar = daVar.r0;
        if (daVar.y()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                daVar.g();
                return true;
            }
            if (itemId != 16908319) {
                if (itemId == 3) {
                    if (daVar.l0 != null) {
                        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                        org.telegram.ui.t tVar = daVar.l0;
                        CharSequence s10 = daVar.s();
                        String str = this.a;
                        g gVar2 = new g(this, 8);
                        org.telegram.ui.i4 i4Var = tVar.a;
                        u31.K(i4Var.L, i4Var.M, str, language, s10, null, gVar2);
                    }
                    daVar.v();
                    return true;
                }
                if (itemId == R.id.menu_quote) {
                    if (daVar.y()) {
                        y9 y9Var = daVar.W;
                        MessageObject messageObject = y9Var instanceof t1 ? ((t1) y9Var).getMessageObject() : null;
                        if (messageObject != null && daVar.s() != null) {
                            daVar.J(daVar.u, daVar.v, messageObject);
                            daVar.f(true);
                        }
                    }
                    daVar.v();
                    return true;
                }
                if (itemId == 16908320) {
                    daVar.E();
                    daVar.v();
                    return true;
                }
                if (itemId != 16908322) {
                    daVar.f(false);
                    return true;
                }
                daVar.I();
                daVar.v();
                return true;
            }
            if (!daVar.K() && (t10 = daVar.t(daVar.W, false)) != null) {
                daVar.u = 0;
                daVar.v = t10.length();
                daVar.v();
                daVar.x();
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
        da daVar;
        y9 y9Var;
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
        if (findItem3 != null && (y9Var = (daVar = this.b).W) != null) {
            CharSequence t10 = daVar.t(y9Var, false);
            if (!this.b.b()) {
                findItem3.setVisible(false);
            } else if (this.b.k()) {
                findItem3.setVisible(true);
            } else {
                da daVar2 = this.b;
                if (daVar2.Z || (daVar2.u <= 0 && daVar2.v >= t10.length() - 1)) {
                    findItem3.setVisible(false);
                } else {
                    findItem3.setVisible(true);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(android.R.id.cut);
        if (findItem4 != null) {
            findItem4.setVisible(this.b instanceof ji.i3);
        }
        MenuItem findItem5 = menu.findItem(android.R.id.paste);
        if (findItem5 != null) {
            da daVar3 = this.b;
            if (daVar3 instanceof ji.i3) {
                try {
                    ca caVar = daVar3.C;
                    Context context = caVar != null ? caVar.getContext() : ApplicationLoader.applicationContext;
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
            LanguageDetector.detectLanguage(this.b.s().toString(), new m9(this, menu), new m9(this, menu));
        }
        return true;
    }
}

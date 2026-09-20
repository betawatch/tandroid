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
import org.telegram.ui.Components.j41;
import org.telegram.ui.f41;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class o9 implements ActionMode.Callback {
    public String a = null;
    public final /* synthetic */ ea b;

    public o9(ea eaVar) {
        this.b = eaVar;
    }

    public final void a(Menu menu) {
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((this.b.l0 == null || ((this.a == null || f41.Y().contains(this.a)) && LanguageDetector.hasSupport())) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence t10;
        ea eaVar = this.b;
        g gVar = eaVar.r0;
        if (eaVar.y()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                eaVar.g();
                return true;
            }
            if (itemId != 16908319) {
                if (itemId == 3) {
                    if (eaVar.l0 != null) {
                        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                        org.telegram.ui.t tVar = eaVar.l0;
                        CharSequence s10 = eaVar.s();
                        String str = this.a;
                        g gVar2 = new g(this, 8);
                        org.telegram.ui.h4 h4Var = tVar.a;
                        j41.K(h4Var.L, h4Var.M, str, language, s10, null, gVar2);
                    }
                    eaVar.v();
                    return true;
                }
                if (itemId == R.id.menu_quote) {
                    if (eaVar.y()) {
                        z9 z9Var = eaVar.W;
                        MessageObject messageObject = z9Var instanceof u1 ? ((u1) z9Var).getMessageObject() : null;
                        if (messageObject != null && eaVar.s() != null) {
                            eaVar.J(eaVar.u, eaVar.v, messageObject);
                            eaVar.f(true);
                        }
                    }
                    eaVar.v();
                    return true;
                }
                if (itemId == 16908320) {
                    eaVar.E();
                    eaVar.v();
                    return true;
                }
                if (itemId != 16908322) {
                    eaVar.f(false);
                    return true;
                }
                eaVar.I();
                eaVar.v();
                return true;
            }
            if (!eaVar.K() && (t10 = eaVar.t(eaVar.W, false)) != null) {
                eaVar.u = 0;
                eaVar.v = t10.length();
                eaVar.v();
                eaVar.x();
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
        ea eaVar;
        z9 z9Var;
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
        if (findItem3 != null && (z9Var = (eaVar = this.b).W) != null) {
            CharSequence t10 = eaVar.t(z9Var, false);
            if (!this.b.b()) {
                findItem3.setVisible(false);
            } else if (this.b.k()) {
                findItem3.setVisible(true);
            } else {
                ea eaVar2 = this.b;
                if (eaVar2.Z || (eaVar2.u <= 0 && eaVar2.v >= t10.length() - 1)) {
                    findItem3.setVisible(false);
                } else {
                    findItem3.setVisible(true);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(android.R.id.cut);
        if (findItem4 != null) {
            findItem4.setVisible(this.b instanceof ii.j3);
        }
        MenuItem findItem5 = menu.findItem(android.R.id.paste);
        if (findItem5 != null) {
            ea eaVar3 = this.b;
            if (eaVar3 instanceof ii.j3) {
                try {
                    da daVar = eaVar3.C;
                    Context context = daVar != null ? daVar.getContext() : ApplicationLoader.applicationContext;
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
            LanguageDetector.detectLanguage(this.b.s().toString(), new n9(this, menu), new n9(this, menu));
        }
        return true;
    }
}

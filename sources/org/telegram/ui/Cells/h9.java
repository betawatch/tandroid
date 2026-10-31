package org.telegram.ui.Cells;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.js;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.mt;
import org.telegram.ui.e01;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h9 implements ActionMode.Callback {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public h9(mt mtVar, ActionMode.Callback callback) {
        this.a = 1;
        this.c = mtVar;
        this.b = callback;
    }

    public void b(Menu menu) {
        cd.D0().y.getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((((w9) this.c).k0 == null || ((String) this.b) == null || e01.c0().contains((String) this.b)) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence s10;
        int i10 = this.a;
        Object obj = this.c;
        switch (i10) {
            case 0:
                w9 w9Var = (w9) obj;
                f fVar = w9Var.m0;
                if (w9Var.x()) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 16908321) {
                        if (w9Var.x() && w9Var.b()) {
                            if (!w9Var.C()) {
                                CharSequence r10 = w9Var.r();
                                if (r10 != null) {
                                    org.telegram.messenger.i0.g(r10);
                                }
                            }
                            w9Var.u();
                            w9Var.f(true);
                            w7.x5 x5Var = w9Var.D;
                            if (x5Var != null) {
                                x5Var.b();
                            }
                        }
                    } else if (itemId == 16908319) {
                        if (!w9Var.J() && (s10 = w9Var.s(w9Var.W, false)) != null) {
                            w9Var.u = 0;
                            w9Var.v = s10.length();
                            w9Var.u();
                            w9Var.w();
                            org.telegram.messenger.i0.r(fVar);
                            org.telegram.messenger.i0.g3(fVar);
                        }
                    } else if (itemId == 3) {
                        if (w9Var.k0 != null) {
                            String language = cd.D0().y.getLanguage();
                            org.telegram.ui.r rVar = w9Var.k0;
                            CharSequence r11 = w9Var.r();
                            String str = (String) this.b;
                            f fVar2 = new f(this, 8);
                            org.telegram.ui.h4 h4Var = rVar.a;
                            m31.U0(h4Var.L, h4Var.M, str, language, r11, null, fVar2);
                        }
                        w9Var.u();
                    } else if (itemId == R.id.menu_quote) {
                        if (w9Var.x()) {
                            r9 r9Var = w9Var.W;
                            jj messageObject = r9Var instanceof q1 ? ((q1) r9Var).getMessageObject() : null;
                            if (messageObject != null && w9Var.r() != null) {
                                w9Var.I(w9Var.u, w9Var.v, messageObject);
                                w9Var.f(true);
                            }
                        }
                        w9Var.u();
                    } else if (itemId == 16908320) {
                        w9Var.D();
                        w9Var.u();
                    } else if (itemId == 16908322) {
                        w9Var.H();
                        w9Var.u();
                    } else {
                        w9Var.f(false);
                    }
                }
                return true;
            default:
                if (((mt) obj).G(menuItem.getItemId())) {
                    actionMode.finish();
                    return true;
                }
                try {
                    return ((ActionMode.Callback) this.b).onActionItemClicked(actionMode, menuItem);
                } catch (Exception unused) {
                    return true;
                }
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                menu.add(0, android.R.id.copy, 0, android.R.string.copy);
                menu.add(0, R.id.menu_quote, 1, cd.L0(2131746455, null));
                menu.add(0, 3, 2, cd.L0(2131743981, null));
                menu.add(0, android.R.id.cut, 3, android.R.string.cut);
                menu.add(0, android.R.id.paste, 4, android.R.string.paste);
                menu.add(0, android.R.id.selectAll, 5, android.R.string.selectAll);
                return true;
            default:
                ((mt) this.c).E();
                return ((ActionMode.Callback) this.b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((mt) this.c).D();
                ((ActionMode.Callback) this.b).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        boolean z10;
        w9 w9Var;
        r9 r9Var;
        switch (this.a) {
            case 0:
                MenuItem findItem = menu.findItem(R.id.menu_quote);
                if (findItem != null) {
                    findItem.setVisible(((w9) this.c).e());
                }
                MenuItem findItem2 = menu.findItem(android.R.id.copy);
                if (findItem2 != null) {
                    findItem2.setVisible(((w9) this.c).b());
                }
                MenuItem findItem3 = menu.findItem(android.R.id.selectAll);
                if (findItem3 != null && (r9Var = (w9Var = (w9) this.c).W) != null) {
                    CharSequence s10 = w9Var.s(r9Var, false);
                    if (!((w9) this.c).b()) {
                        findItem3.setVisible(false);
                    } else if (((w9) this.c).j()) {
                        findItem3.setVisible(true);
                    } else {
                        w9 w9Var2 = (w9) this.c;
                        if (w9Var2.Z || (w9Var2.u <= 0 && w9Var2.v >= s10.length() - 1)) {
                            findItem3.setVisible(false);
                        } else {
                            findItem3.setVisible(true);
                        }
                    }
                }
                MenuItem findItem4 = menu.findItem(android.R.id.cut);
                if (findItem4 != null) {
                    findItem4.setVisible(((w9) this.c) instanceof bi.q3);
                }
                MenuItem findItem5 = menu.findItem(android.R.id.paste);
                if (findItem5 != null) {
                    w9 w9Var3 = (w9) this.c;
                    if (w9Var3 instanceof bi.q3) {
                        try {
                            v9 v9Var = w9Var3.C;
                            context = v9Var != null ? v9Var.getContext() : org.telegram.messenger.w0.b;
                        } catch (Exception unused) {
                        }
                        if (context != null && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null) {
                            if (clipboardManager.hasPrimaryClip()) {
                                z10 = true;
                                findItem5.setVisible(z10);
                            }
                        }
                    }
                    z10 = false;
                    findItem5.setVisible(z10);
                }
                w9 w9Var4 = (w9) this.c;
                if (w9Var4.k0 == null || w9Var4.r() == null) {
                    this.b = null;
                    b(menu);
                } else {
                    js.d(((w9) this.c).r().toString(), new g9(this, menu), new g9(this, menu), false);
                }
                return true;
            default:
                return ((ActionMode.Callback) this.b).onPrepareActionMode(actionMode, menu);
        }
    }

    public h9(w9 w9Var) {
        this.a = 0;
        this.c = w9Var;
        this.b = null;
    }

    private final void a(ActionMode actionMode) {
    }
}

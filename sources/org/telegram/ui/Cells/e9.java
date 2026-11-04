package org.telegram.ui.Cells;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import b8.hf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.xs;
import org.telegram.ui.gy0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e9 implements ActionMode.Callback {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public e9(xs xsVar, ActionMode.Callback callback) {
        this.a = 1;
        this.c = xsVar;
        this.b = callback;
    }

    public void b(Menu menu) {
        bd.E0().y.getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((((u9) this.c).k0 == null || ((String) this.b) == null || gy0.d0().contains((String) this.b)) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence s6;
        int i3 = this.a;
        Object obj = this.c;
        switch (i3) {
            case 0:
                u9 u9Var = (u9) obj;
                f fVar = u9Var.m0;
                if (u9Var.x()) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 16908321) {
                        if (u9Var.x() && u9Var.b()) {
                            if (!u9Var.C()) {
                                CharSequence r5 = u9Var.r();
                                if (r5 != null) {
                                    org.telegram.messenger.g0.g(r5);
                                }
                            }
                            u9Var.u();
                            u9Var.f(true);
                            hf hfVar = u9Var.D;
                            if (hfVar != null) {
                                hfVar.b();
                            }
                        }
                    } else if (itemId == 16908319) {
                        if (!u9Var.J() && (s6 = u9Var.s(u9Var.W, false)) != null) {
                            u9Var.u = 0;
                            u9Var.v = s6.length();
                            u9Var.u();
                            u9Var.w();
                            org.telegram.messenger.g0.r(fVar);
                            org.telegram.messenger.g0.h3(fVar);
                        }
                    } else if (itemId == 3) {
                        if (u9Var.k0 != null) {
                            String language = bd.E0().y.getLanguage();
                            org.telegram.ui.s sVar = u9Var.k0;
                            CharSequence r9 = u9Var.r();
                            String str = (String) this.b;
                            f fVar2 = new f(this, 9);
                            org.telegram.ui.i4 i4Var = sVar.a;
                            f21.U0(i4Var.M, i4Var.N, str, language, r9, null, fVar2);
                        }
                        u9Var.u();
                    } else if (itemId == R.id.menu_quote) {
                        if (u9Var.x()) {
                            p9 p9Var = u9Var.W;
                            zi messageObject = p9Var instanceof q1 ? ((q1) p9Var).getMessageObject() : null;
                            if (messageObject != null && u9Var.r() != null) {
                                u9Var.I(u9Var.u, u9Var.v, messageObject);
                                u9Var.f(true);
                            }
                        }
                        u9Var.u();
                    } else if (itemId == 16908320) {
                        u9Var.D();
                        u9Var.u();
                    } else if (itemId == 16908322) {
                        u9Var.H();
                        u9Var.u();
                    } else {
                        u9Var.f(false);
                    }
                }
                return true;
            default:
                if (((xs) obj).G(menuItem.getItemId())) {
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
                menu.add(0, R.id.menu_quote, 1, bd.M0(2131746448, null));
                menu.add(0, 3, 2, bd.M0(2131743966, null));
                menu.add(0, android.R.id.cut, 3, android.R.string.cut);
                menu.add(0, android.R.id.paste, 4, android.R.string.paste);
                menu.add(0, android.R.id.selectAll, 5, android.R.string.selectAll);
                return true;
            default:
                ((xs) this.c).E();
                return ((ActionMode.Callback) this.b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((xs) this.c).D();
                ((ActionMode.Callback) this.b).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        boolean z10;
        u9 u9Var;
        p9 p9Var;
        switch (this.a) {
            case 0:
                MenuItem findItem = menu.findItem(R.id.menu_quote);
                if (findItem != null) {
                    findItem.setVisible(((u9) this.c).e());
                }
                MenuItem findItem2 = menu.findItem(android.R.id.copy);
                if (findItem2 != null) {
                    findItem2.setVisible(((u9) this.c).b());
                }
                MenuItem findItem3 = menu.findItem(android.R.id.selectAll);
                if (findItem3 != null && (p9Var = (u9Var = (u9) this.c).W) != null) {
                    CharSequence s6 = u9Var.s(p9Var, false);
                    if (!((u9) this.c).b()) {
                        findItem3.setVisible(false);
                    } else if (((u9) this.c).j()) {
                        findItem3.setVisible(true);
                    } else {
                        u9 u9Var2 = (u9) this.c;
                        if (u9Var2.Z || (u9Var2.u <= 0 && u9Var2.v >= s6.length() - 1)) {
                            findItem3.setVisible(false);
                        } else {
                            findItem3.setVisible(true);
                        }
                    }
                }
                MenuItem findItem4 = menu.findItem(android.R.id.cut);
                if (findItem4 != null) {
                    findItem4.setVisible(((u9) this.c) instanceof mi.h3);
                }
                MenuItem findItem5 = menu.findItem(android.R.id.paste);
                if (findItem5 != null) {
                    u9 u9Var3 = (u9) this.c;
                    if (u9Var3 instanceof mi.h3) {
                        try {
                            t9 t9Var = u9Var3.C;
                            context = t9Var != null ? t9Var.getContext() : org.telegram.messenger.t0.b;
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
                u9 u9Var4 = (u9) this.c;
                if (u9Var4.k0 == null || u9Var4.r() == null) {
                    this.b = null;
                    b(menu);
                } else {
                    org.telegram.messenger.b6.d(((u9) this.c).r().toString(), new d9(this, menu), new d9(this, menu), false);
                }
                return true;
            default:
                return ((ActionMode.Callback) this.b).onPrepareActionMode(actionMode, menu);
        }
    }

    public e9(u9 u9Var) {
        this.a = 0;
        this.c = u9Var;
        this.b = null;
    }

    private final void a(ActionMode actionMode) {
    }
}

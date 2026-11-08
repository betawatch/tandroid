package org.telegram.ui.Cells;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.zs;
import org.telegram.ui.qy0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class f9 implements ActionMode.Callback {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public f9(zs zsVar, ActionMode.Callback callback) {
        this.a = 1;
        this.c = zsVar;
        this.b = callback;
    }

    public void b(Menu menu) {
        id.E0().y.getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((((v9) this.c).k0 == null || ((String) this.b) == null || qy0.d0().contains((String) this.b)) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence s5;
        int i7 = this.a;
        Object obj = this.c;
        switch (i7) {
            case 0:
                v9 v9Var = (v9) obj;
                f fVar = v9Var.m0;
                if (v9Var.x()) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 16908321) {
                        if (v9Var.x() && v9Var.b()) {
                            if (!v9Var.C()) {
                                CharSequence r10 = v9Var.r();
                                if (r10 != null) {
                                    org.telegram.messenger.g0.g(r10);
                                }
                            }
                            v9Var.u();
                            v9Var.f(true);
                            c8.da daVar = v9Var.D;
                            if (daVar != null) {
                                daVar.b();
                            }
                        }
                    } else if (itemId == 16908319) {
                        if (!v9Var.J() && (s5 = v9Var.s(v9Var.W, false)) != null) {
                            v9Var.u = 0;
                            v9Var.v = s5.length();
                            v9Var.u();
                            v9Var.w();
                            org.telegram.messenger.g0.r(fVar);
                            org.telegram.messenger.g0.h3(fVar);
                        }
                    } else if (itemId == 3) {
                        if (v9Var.k0 != null) {
                            String language = id.E0().y.getLanguage();
                            org.telegram.ui.s sVar = v9Var.k0;
                            CharSequence r11 = v9Var.r();
                            String str = (String) this.b;
                            f fVar2 = new f(this, 9);
                            org.telegram.ui.g4 g4Var = sVar.a;
                            k21.U0(g4Var.L, g4Var.M, str, language, r11, null, fVar2);
                        }
                        v9Var.u();
                    } else if (itemId == R.id.menu_quote) {
                        if (v9Var.x()) {
                            q9 q9Var = v9Var.W;
                            ij messageObject = q9Var instanceof q1 ? ((q1) q9Var).getMessageObject() : null;
                            if (messageObject != null && v9Var.r() != null) {
                                v9Var.I(v9Var.u, v9Var.v, messageObject);
                                v9Var.f(true);
                            }
                        }
                        v9Var.u();
                    } else if (itemId == 16908320) {
                        v9Var.D();
                        v9Var.u();
                    } else if (itemId == 16908322) {
                        v9Var.H();
                        v9Var.u();
                    } else {
                        v9Var.f(false);
                    }
                }
                return true;
            default:
                if (((zs) obj).G(menuItem.getItemId())) {
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
                menu.add(0, R.id.menu_quote, 1, id.M0(2131746441, null));
                menu.add(0, 3, 2, id.M0(2131743959, null));
                menu.add(0, android.R.id.cut, 3, android.R.string.cut);
                menu.add(0, android.R.id.paste, 4, android.R.string.paste);
                menu.add(0, android.R.id.selectAll, 5, android.R.string.selectAll);
                return true;
            default:
                ((zs) this.c).E();
                return ((ActionMode.Callback) this.b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((zs) this.c).D();
                ((ActionMode.Callback) this.b).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        boolean z9;
        v9 v9Var;
        q9 q9Var;
        switch (this.a) {
            case 0:
                MenuItem findItem = menu.findItem(R.id.menu_quote);
                if (findItem != null) {
                    findItem.setVisible(((v9) this.c).e());
                }
                MenuItem findItem2 = menu.findItem(android.R.id.copy);
                if (findItem2 != null) {
                    findItem2.setVisible(((v9) this.c).b());
                }
                MenuItem findItem3 = menu.findItem(android.R.id.selectAll);
                if (findItem3 != null && (q9Var = (v9Var = (v9) this.c).W) != null) {
                    CharSequence s5 = v9Var.s(q9Var, false);
                    if (!((v9) this.c).b()) {
                        findItem3.setVisible(false);
                    } else if (((v9) this.c).j()) {
                        findItem3.setVisible(true);
                    } else {
                        v9 v9Var2 = (v9) this.c;
                        if (v9Var2.Z || (v9Var2.u <= 0 && v9Var2.v >= s5.length() - 1)) {
                            findItem3.setVisible(false);
                        } else {
                            findItem3.setVisible(true);
                        }
                    }
                }
                MenuItem findItem4 = menu.findItem(android.R.id.cut);
                if (findItem4 != null) {
                    findItem4.setVisible(((v9) this.c) instanceof li.g3);
                }
                MenuItem findItem5 = menu.findItem(android.R.id.paste);
                if (findItem5 != null) {
                    v9 v9Var3 = (v9) this.c;
                    if (v9Var3 instanceof li.g3) {
                        try {
                            u9 u9Var = v9Var3.C;
                            context = u9Var != null ? u9Var.getContext() : org.telegram.messenger.t0.b;
                        } catch (Exception unused) {
                        }
                        if (context != null && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null) {
                            if (clipboardManager.hasPrimaryClip()) {
                                z9 = true;
                                findItem5.setVisible(z9);
                            }
                        }
                    }
                    z9 = false;
                    findItem5.setVisible(z9);
                }
                v9 v9Var4 = (v9) this.c;
                if (v9Var4.k0 == null || v9Var4.r() == null) {
                    this.b = null;
                    b(menu);
                } else {
                    org.telegram.messenger.b6.d(((v9) this.c).r().toString(), new e9(this, menu), new e9(this, menu), false);
                }
                return true;
            default:
                return ((ActionMode.Callback) this.b).onPrepareActionMode(actionMode, menu);
        }
    }

    public f9(v9 v9Var) {
        this.a = 0;
        this.c = v9Var;
        this.b = null;
    }

    private final void a(ActionMode actionMode) {
    }
}

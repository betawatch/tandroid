package org.telegram.ui.Cells;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.ot;
import org.telegram.ui.sy0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class g9 implements ActionMode.Callback {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public g9(ot otVar, ActionMode.Callback callback) {
        this.a = 1;
        this.c = otVar;
        this.b = callback;
    }

    public void b(Menu menu) {
        hd.E0().y.getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((((w9) this.c).k0 == null || ((String) this.b) == null || sy0.d0().contains((String) this.b)) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence s5;
        int i7 = this.a;
        Object obj = this.c;
        switch (i7) {
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
                                    org.telegram.messenger.g0.g(r10);
                                }
                            }
                            w9Var.u();
                            w9Var.f(true);
                            c8.ha haVar = w9Var.D;
                            if (haVar != null) {
                                haVar.b();
                            }
                        }
                    } else if (itemId == 16908319) {
                        if (!w9Var.J() && (s5 = w9Var.s(w9Var.W, false)) != null) {
                            w9Var.u = 0;
                            w9Var.v = s5.length();
                            w9Var.u();
                            w9Var.w();
                            org.telegram.messenger.g0.r(fVar);
                            org.telegram.messenger.g0.g3(fVar);
                        }
                    } else if (itemId == 3) {
                        if (w9Var.k0 != null) {
                            String language = hd.E0().y.getLanguage();
                            org.telegram.ui.s sVar = w9Var.k0;
                            CharSequence r11 = w9Var.r();
                            String str = (String) this.b;
                            f fVar2 = new f(this, 10);
                            org.telegram.ui.g4 g4Var = sVar.a;
                            b31.W0(g4Var.M, g4Var.N, str, language, r11, null, fVar2);
                        }
                        w9Var.u();
                    } else if (itemId == R.id.menu_quote) {
                        if (w9Var.x()) {
                            r9 r9Var = w9Var.W;
                            gj messageObject = r9Var instanceof r1 ? ((r1) r9Var).getMessageObject() : null;
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
                if (((ot) obj).H(menuItem.getItemId())) {
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
                menu.add(0, R.id.menu_quote, 1, hd.N0(2131746244, null));
                menu.add(0, 3, 2, hd.N0(2131743711, null));
                menu.add(0, android.R.id.cut, 3, android.R.string.cut);
                menu.add(0, android.R.id.paste, 4, android.R.string.paste);
                menu.add(0, android.R.id.selectAll, 5, android.R.string.selectAll);
                return true;
            default:
                ((ot) this.c).F();
                return ((ActionMode.Callback) this.b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((ot) this.c).E();
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
                    CharSequence s5 = w9Var.s(r9Var, false);
                    if (!((w9) this.c).b()) {
                        findItem3.setVisible(false);
                    } else if (((w9) this.c).j()) {
                        findItem3.setVisible(true);
                    } else {
                        w9 w9Var2 = (w9) this.c;
                        if (w9Var2.Z || (w9Var2.u <= 0 && w9Var2.v >= s5.length() - 1)) {
                            findItem3.setVisible(false);
                        } else {
                            findItem3.setVisible(true);
                        }
                    }
                }
                MenuItem findItem4 = menu.findItem(android.R.id.cut);
                if (findItem4 != null) {
                    findItem4.setVisible(((w9) this.c) instanceof oi.h3);
                }
                MenuItem findItem5 = menu.findItem(android.R.id.paste);
                if (findItem5 != null) {
                    w9 w9Var3 = (w9) this.c;
                    if (w9Var3 instanceof oi.h3) {
                        try {
                            v9 v9Var = w9Var3.C;
                            context = v9Var != null ? v9Var.getContext() : org.telegram.messenger.t0.b;
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
                    org.telegram.messenger.c6.d(((w9) this.c).r().toString(), new f9(this, menu), new f9(this, menu), false);
                }
                return true;
            default:
                return ((ActionMode.Callback) this.b).onPrepareActionMode(actionMode, menu);
        }
    }

    public g9(w9 w9Var) {
        this.a = 0;
        this.c = w9Var;
        this.b = null;
    }

    private final void a(ActionMode actionMode) {
    }
}

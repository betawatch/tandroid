// default package

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dt3 implements ActionMode.Callback {
    public final /* synthetic */ byte a;
    public Object b;
    public final /* synthetic */ Object c;

    public dt3(rib ribVar) {
        this.a = (byte) 1;
        this.c = ribVar;
        this.b = null;
    }

    public final void b(Menu menu) {
        k96.D0().y.getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((((rib) this.c).k0 == null || ((String) this.b) == null || qa9.b0().contains((String) this.b)) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence r;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (((gt3) obj).H(menuItem.getItemId())) {
                    actionMode.finish();
                    return true;
                }
                try {
                    return ((ActionMode.Callback) this.b).onActionItemClicked(actionMode, menuItem);
                } catch (Exception unused) {
                    return true;
                }
            default:
                rib ribVar = (rib) obj;
                kya kyaVar = ribVar.m0;
                if (ribVar.w()) {
                    int itemId = menuItem.getItemId();
                    if (itemId != 16908321) {
                        byte b2 = 0;
                        if (itemId == 16908319) {
                            if (!ribVar.I() && (r = ribVar.r(ribVar.W, false)) != null) {
                                ribVar.u = 0;
                                ribVar.v = r.length();
                                ribVar.t();
                                ribVar.v();
                                gl.r(kyaVar);
                                gl.d3(kyaVar);
                            }
                        } else if (itemId == 3) {
                            if (ribVar.k0 != null) {
                                String language = k96.D0().y.getLanguage();
                                ys ysVar = ribVar.k0;
                                CharSequence q = ribVar.q();
                                String str = (String) this.b;
                                cib cibVar = new cib(this, b2);
                                o oVar = ysVar.a;
                                rzb.Q0(oVar.M, oVar.N, str, language, q, null, cibVar);
                            }
                            ribVar.t();
                        } else if (itemId == R.id.menu_quote) {
                            if (ribVar.w()) {
                                mib mibVar = ribVar.W;
                                k27 messageObject = mibVar instanceof gb2 ? ((gb2) mibVar).getMessageObject() : null;
                                if (messageObject != null && ribVar.q() != null) {
                                    ribVar.H(ribVar.u, ribVar.v, messageObject);
                                    ribVar.e(true);
                                }
                            }
                            ribVar.t();
                        } else if (itemId == 16908320) {
                            ribVar.C();
                            ribVar.t();
                        } else if (itemId == 16908322) {
                            ribVar.G();
                            ribVar.t();
                        } else {
                            ribVar.e(false);
                        }
                    } else if (ribVar.w() && ribVar.a()) {
                        if (!ribVar.B()) {
                            CharSequence q2 = ribVar.q();
                            if (q2 != null) {
                                gl.g(q2);
                            }
                        }
                        ribVar.t();
                        ribVar.e(true);
                        ive iveVar = ribVar.D;
                        if (iveVar != null) {
                            iveVar.b();
                        }
                    }
                }
                return true;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((gt3) this.c).F();
                return ((ActionMode.Callback) this.b).onCreateActionMode(actionMode, menu);
            default:
                menu.add(0, android.R.id.copy, 0, android.R.string.copy);
                menu.add(0, R.id.menu_quote, 1, k96.M0(2131746247, null));
                menu.add(0, 3, 2, k96.M0(2131743717, null));
                menu.add(0, android.R.id.cut, 3, android.R.string.cut);
                menu.add(0, android.R.id.paste, 4, android.R.string.paste);
                menu.add(0, android.R.id.selectAll, 5, android.R.string.selectAll);
                return true;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.a) {
            case 0:
                ((gt3) this.c).E();
                ((ActionMode.Callback) this.b).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        boolean z;
        rib ribVar;
        mib mibVar;
        switch (this.a) {
            case 0:
                return ((ActionMode.Callback) this.b).onPrepareActionMode(actionMode, menu);
            default:
                MenuItem findItem = menu.findItem(R.id.menu_quote);
                if (findItem != null) {
                    findItem.setVisible(((rib) this.c).d());
                }
                MenuItem findItem2 = menu.findItem(android.R.id.copy);
                if (findItem2 != null) {
                    findItem2.setVisible(((rib) this.c).a());
                }
                MenuItem findItem3 = menu.findItem(android.R.id.selectAll);
                if (findItem3 != null && (mibVar = (ribVar = (rib) this.c).W) != null) {
                    CharSequence r = ribVar.r(mibVar, false);
                    if (!((rib) this.c).a()) {
                        findItem3.setVisible(false);
                    } else if (((rib) this.c).i()) {
                        findItem3.setVisible(true);
                    } else {
                        rib ribVar2 = (rib) this.c;
                        if (ribVar2.Z || (ribVar2.u <= 0 && ribVar2.v >= r.length() - 1)) {
                            findItem3.setVisible(false);
                        } else {
                            findItem3.setVisible(true);
                        }
                    }
                }
                MenuItem findItem4 = menu.findItem(android.R.id.cut);
                if (findItem4 != null) {
                    findItem4.setVisible(((rib) this.c) instanceof me9);
                }
                MenuItem findItem5 = menu.findItem(android.R.id.paste);
                if (findItem5 != null) {
                    rib ribVar3 = (rib) this.c;
                    if (ribVar3 instanceof me9) {
                        try {
                            qib qibVar = ribVar3.C;
                            context = qibVar != null ? qibVar.getContext() : a.b;
                        } catch (Exception unused) {
                        }
                        if (context != null && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null) {
                            if (clipboardManager.hasPrimaryClip()) {
                                z = true;
                                findItem5.setVisible(z);
                            }
                        }
                    }
                    z = false;
                    findItem5.setVisible(z);
                }
                rib ribVar4 = (rib) this.c;
                if (ribVar4.k0 == null || ribVar4.q() == null) {
                    this.b = null;
                    b(menu);
                } else {
                    cme.b(((rib) this.c).q().toString(), new dib(this, menu), new dib(this, menu), false);
                }
                return true;
        }
    }

    public dt3(gt3 gt3Var, ActionMode.Callback callback) {
        this.a = (byte) 0;
        this.c = gt3Var;
        this.b = callback;
    }

    private final void a(ActionMode actionMode) {
    }
}

// default package

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nu3 implements ActionMode.Callback {
    public final /* synthetic */ byte a;
    public Object b;
    public final /* synthetic */ Object c;

    public nu3(skb skbVar) {
        this.a = (byte) 1;
        this.c = skbVar;
        this.b = null;
    }

    public final void b(Menu menu) {
        jb6.D0().y.getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((((skb) this.c).k0 == null || ((String) this.b) == null || qc9.c0().contains((String) this.b)) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence r;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (((qu3) obj).H(menuItem.getItemId())) {
                    actionMode.finish();
                    return true;
                }
                try {
                    return ((ActionMode.Callback) this.b).onActionItemClicked(actionMode, menuItem);
                } catch (Exception unused) {
                    return true;
                }
            default:
                skb skbVar = (skb) obj;
                zcb zcbVar = skbVar.m0;
                if (skbVar.w()) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 16908321) {
                        if (skbVar.w() && skbVar.a()) {
                            if (!skbVar.B()) {
                                CharSequence q = skbVar.q();
                                if (q != null) {
                                    gm.g(q);
                                }
                            }
                            skbVar.t();
                            skbVar.e(true);
                            kxe kxeVar = skbVar.D;
                            if (kxeVar != null) {
                                kxeVar.b();
                            }
                        }
                    } else if (itemId == 16908319) {
                        if (!skbVar.I() && (r = skbVar.r(skbVar.W, false)) != null) {
                            skbVar.u = 0;
                            skbVar.v = r.length();
                            skbVar.t();
                            skbVar.v();
                            gm.r(zcbVar);
                            gm.c3(zcbVar);
                        }
                    } else if (itemId == 3) {
                        if (skbVar.k0 != null) {
                            String language = jb6.D0().y.getLanguage();
                            zt ztVar = skbVar.k0;
                            CharSequence q2 = skbVar.q();
                            String str = (String) this.b;
                            zcb zcbVar2 = new zcb(this, (byte) 8);
                            o oVar = ztVar.a;
                            s1c.Q0(oVar.M, oVar.N, str, language, q2, null, zcbVar2);
                        }
                        skbVar.t();
                    } else if (itemId == R.id.menu_quote) {
                        if (skbVar.w()) {
                            nkb nkbVar = skbVar.W;
                            k47 messageObject = nkbVar instanceof rc2 ? ((rc2) nkbVar).getMessageObject() : null;
                            if (messageObject != null && skbVar.q() != null) {
                                skbVar.H(skbVar.u, skbVar.v, messageObject);
                                skbVar.e(true);
                            }
                        }
                        skbVar.t();
                    } else if (itemId == 16908320) {
                        skbVar.C();
                        skbVar.t();
                    } else if (itemId == 16908322) {
                        skbVar.G();
                        skbVar.t();
                    } else {
                        skbVar.e(false);
                    }
                }
                return true;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((qu3) this.c).F();
                return ((ActionMode.Callback) this.b).onCreateActionMode(actionMode, menu);
            default:
                menu.add(0, android.R.id.copy, 0, android.R.string.copy);
                menu.add(0, R.id.menu_quote, 1, jb6.M0(2131746173, null));
                menu.add(0, 3, 2, jb6.M0(2131743643, null));
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
                ((qu3) this.c).E();
                ((ActionMode.Callback) this.b).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        boolean z;
        skb skbVar;
        nkb nkbVar;
        switch (this.a) {
            case 0:
                return ((ActionMode.Callback) this.b).onPrepareActionMode(actionMode, menu);
            default:
                MenuItem findItem = menu.findItem(R.id.menu_quote);
                if (findItem != null) {
                    findItem.setVisible(((skb) this.c).d());
                }
                MenuItem findItem2 = menu.findItem(android.R.id.copy);
                if (findItem2 != null) {
                    findItem2.setVisible(((skb) this.c).a());
                }
                MenuItem findItem3 = menu.findItem(android.R.id.selectAll);
                if (findItem3 != null && (nkbVar = (skbVar = (skb) this.c).W) != null) {
                    CharSequence r = skbVar.r(nkbVar, false);
                    if (!((skb) this.c).a()) {
                        findItem3.setVisible(false);
                    } else if (((skb) this.c).i()) {
                        findItem3.setVisible(true);
                    } else {
                        skb skbVar2 = (skb) this.c;
                        if (skbVar2.Z || (skbVar2.u <= 0 && skbVar2.v >= r.length() - 1)) {
                            findItem3.setVisible(false);
                        } else {
                            findItem3.setVisible(true);
                        }
                    }
                }
                MenuItem findItem4 = menu.findItem(android.R.id.cut);
                if (findItem4 != null) {
                    findItem4.setVisible(((skb) this.c) instanceof qg9);
                }
                MenuItem findItem5 = menu.findItem(android.R.id.paste);
                if (findItem5 != null) {
                    skb skbVar3 = (skb) this.c;
                    if (skbVar3 instanceof qg9) {
                        try {
                            rkb rkbVar = skbVar3.C;
                            context = rkbVar != null ? rkbVar.getContext() : a.b;
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
                skb skbVar4 = (skb) this.c;
                if (skbVar4.k0 == null || skbVar4.q() == null) {
                    this.b = null;
                    b(menu);
                } else {
                    eoe.b(((skb) this.c).q().toString(), new ekb(this, menu), new ekb(this, menu), false);
                }
                return true;
        }
    }

    public nu3(qu3 qu3Var, ActionMode.Callback callback) {
        this.a = (byte) 0;
        this.c = qu3Var;
        this.b = callback;
    }

    private final void a(ActionMode actionMode) {
    }
}

// default package

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class n9b extends la {
    public final Context d;
    public final vnb e;
    public final l9b f;
    public d79 h;
    public final /* synthetic */ r9b n;

    public n9b(r9b r9bVar, Context context, vnb vnbVar, l9b l9bVar, c68 c68Var) {
        this.n = r9bVar;
        this.d = context;
        this.e = vnbVar;
        this.f = l9bVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return (i == 3 && this.n.a0.z1) || i == 7 || i == 9 || i == 10;
    }

    @Override // j79
    public final int b() {
        ArrayList arrayList = this.n.M;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // j79
    public final int d(int i) {
        ArrayList arrayList = this.n.M;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return -1;
        }
        return ((h9b) arrayList.get(i)).a;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2;
        int i3;
        r9b r9bVar = this.n;
        w9b w9bVar = r9bVar.a0;
        ArrayList arrayList = r9bVar.M;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        h9b h9bVar = (h9b) arrayList.get(i);
        int i4 = f89Var.f;
        View view = f89Var.a;
        boolean z = true;
        int i5 = i + 1;
        h9b h9bVar2 = i5 < arrayList.size() ? (h9b) arrayList.get(i5) : null;
        boolean z2 = h9bVar2 != null && ((i3 = h9bVar2.a) == i4 || (i3 == 9 && h9bVar2.q == 1));
        if (i4 == 3) {
            v9b v9bVar = (v9b) view;
            boolean z3 = h9bVar.n;
            v9bVar.d(z3, !z3);
            byte b = h9bVar.i;
            float f = 1.0f;
            if (b > 0) {
                v9bVar.e(b, h9bVar.j, h9bVar.g);
                v9bVar.b(false, 1.0f);
            } else {
                TLRPC.User user = h9bVar.g;
                if (user != null) {
                    v9bVar.setUser(user);
                    if (h9bVar.l && !h9bVar.k) {
                        f = 0.5f;
                    }
                    v9bVar.b(false, f);
                } else {
                    TLRPC.Chat chat = h9bVar.h;
                    if (chat != null) {
                        int i6 = w9b.X1;
                        v9bVar.a(w9bVar.K0(chat), chat);
                    }
                }
            }
            if (!h9bVar.k && !h9bVar.l) {
                z = false;
            }
            v9bVar.c(z, false);
            v9bVar.setDivider(z2);
            v9bVar.setRedCheckbox(h9bVar.m);
            v9bVar.w = w9bVar.z1;
            return;
        }
        if (i4 != 2) {
            if (i4 == 0) {
                view.setLayoutParams(new r79(-1, hl.L(56.0f)));
                return;
            }
            if (i4 == -1) {
                if (h9bVar.o > 0) {
                    d79 d79Var = this.h;
                    i2 = Math.max(((d79Var == null || d79Var.getMeasuredHeight() <= 0) ? hl.q.y : this.h.getMeasuredHeight() + r9bVar.U) - h9bVar.o, hl.L(120.0f));
                    view.setTag(33);
                } else {
                    i2 = h9bVar.p;
                    if (i2 >= 0) {
                        view.setTag(null);
                    } else {
                        i2 = (int) (hl.q.y * 0.3f);
                        view.setTag(33);
                    }
                }
                view.setLayoutParams(new r79(-1, i2));
                return;
            }
            if (i4 == 1) {
                view.setLayoutParams(new r79(-1, Math.min(hl.L(150.0f), this.f.L)));
                return;
            }
            if (i4 == 4) {
                g9b g9bVar = (g9b) view;
                CharSequence charSequence = h9bVar.e;
                CharSequence charSequence2 = h9bVar.f;
                g9bVar.a.setText(charSequence);
                g9bVar.b.setText(charSequence2);
                return;
            }
            if (i4 == 11) {
                g9b g9bVar2 = (g9b) view;
                g9bVar2.a.setText(h9bVar.e);
                g9bVar2.b.setText((CharSequence) null);
                return;
            }
            if (i4 == 5) {
                try {
                    ((z2b) view).b.getImageReceiver().w0(false);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i4 == 6) {
                ilb ilbVar = (ilb) view;
                if (h9bVar.e == null) {
                    ilbVar.setFixedSize(12);
                    ilbVar.setText(null);
                    return;
                } else {
                    ilbVar.setFixedSize(0);
                    ilbVar.setText(h9bVar.e);
                    return;
                }
            }
            if (i4 == 7) {
                byte b2 = h9bVar.c;
                if (b2 == 0) {
                    ((skb) view).l(h9bVar.e, w9bVar.w1, z2);
                    return;
                } else if (b2 == 1) {
                    ((skb) view).l(h9bVar.e, w9bVar.x1, z2);
                    return;
                } else {
                    if (b2 == 2) {
                        ((skb) view).l(h9bVar.e, w9bVar.v1, z2);
                        return;
                    }
                    return;
                }
            }
            if (i4 == 9) {
                BitmapDrawable bitmapDrawable = h9bVar.d;
                if (bitmapDrawable != null) {
                    ((skb) view).v(h9bVar.e, bitmapDrawable, z2);
                    return;
                } else {
                    ((skb) view).q(h9bVar.e, h9bVar.f, false, z2);
                    return;
                }
            }
            if (i4 == 8) {
                ((mf5) view).setText(h9bVar.e);
                return;
            }
            if (i4 == 10) {
                int i7 = w9b.X1;
                int f2 = (int) uc7.s1(w9bVar.a).l4.P1.f();
                int[] a = bna.a(new int[]{0, 1, 10, 50, 100, jn7.d3, jn7.Y3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, f2);
                int j = Utilities.j(w9bVar.B1, f2, 0);
                bya byaVar = new bya((byte) 3);
                ana anaVar = new ana();
                anaVar.c = a;
                anaVar.d = (byte) 20;
                anaVar.e = byaVar;
                ((bna) view).d(j, anaVar, new sh9(this, (byte) 17));
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View skbVar;
        View view;
        Context context = this.d;
        if (i == -1) {
            view = new q9b(context);
        } else if (i == 0) {
            View view2 = new View(context);
            view2.setTag(35);
            view = view2;
        } else if (i == 1) {
            View view3 = new View(context);
            view3.setTag(34);
            view = view3;
        } else {
            vnb vnbVar = this.e;
            if (i == 3) {
                view = new v9b(context, vnbVar);
            } else if (i == 4) {
                view = new g9b(vnbVar, context, true);
            } else if (i == 11) {
                view = new g9b(vnbVar, context, false);
            } else if (i == 8) {
                View mf5Var = new mf5(context, vnbVar);
                yob.h(aob.h5, vnbVar, mf5Var);
                view = mf5Var;
            } else if (i == 5) {
                z2b z2bVar = new z2b(context, null, 1, vnbVar);
                z2bVar.d.setText(ob6.M0(2131747898, null));
                z2bVar.e.setText(ob6.M0(2131745535, null));
                z2bVar.a.setTranslationY(hl.L(24.0f));
                view = z2bVar;
            } else if (i == 6) {
                View ilbVar = new ilb(context, vnbVar);
                ilbVar.setBackgroundColor(-15921907);
                view = ilbVar;
            } else {
                if (i == 7) {
                    skbVar = new skb(23, this.e, this.d, true, true);
                } else if (i == 9) {
                    skbVar = new skb(23, this.e, this.d, true, false);
                } else {
                    view = i == 10 ? new bna(context, vnbVar) : new t62(context, (byte) 26);
                }
                view = skbVar;
            }
        }
        return new n69(view);
    }
}

// default package

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class im6 implements d4b, sv6, us2, lx6, ix6, e39, gj, kg7, ni6, n8c, ll5, yr9, ed, a5c, ac1, js4, e36, w58, y48, OnSuccessListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ im6(p5a p5aVar) {
        this.a = (byte) 1;
        Bundle bundle = Bundle.EMPTY;
        this.b = p5aVar;
    }

    @Override // ll5
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        MusicPlayerService musicPlayerService = (MusicPlayerService) this.b;
        boolean z4 = MusicPlayerService.s;
        if (!z || TextUtils.isEmpty(musicPlayerService.n)) {
            return;
        }
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null) {
            musicPlayerService.a(k27Var, true);
        }
        musicPlayerService.n = null;
    }

    @Override // yr9
    public final vf6 O0() {
        return null;
    }

    @Override // yr9
    public final boolean U1(int i) {
        return true;
    }

    @Override // us2
    public final void accept(Object obj) {
        ((ad8) obj).b((zb8) this.b);
    }

    @Override // kg7
    public final void b(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // e36
    public final void c() {
        ((g38) this.b).D0(true);
    }

    @Override // e39
    public final boolean d(int i, View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 7:
                final s47 s47Var = (s47) obj;
                if (i >= s47Var.J && i < s47Var.K) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final k27 k27Var = (k27) s47Var.y.get(i - s47Var.J);
                    final long B0 = k27.B0(k27Var.k);
                    final boolean D = cf3.D(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, s47Var.getResourceProvider(), s47Var.getParentActivity());
                    if (k27Var.w4()) {
                        arrayList.add(k96.M0(D ? 2131747593 : 2131747618, null));
                        arrayList3.add(Integer.valueOf(D ? R.drawable.msg_openprofile : R.drawable.msg_channel));
                    } else {
                        b00.r(null, 2131743308, arrayList, R.drawable.msg_msgbubble3, arrayList3);
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    Typeface typeface = gl.a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        iArr[i2] = ((Integer) arrayList3.get(i2)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: n47
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            k27 k27Var2 = k27Var;
                            boolean w4 = k27Var2.w4();
                            d dVar = s47.this;
                            boolean z = D;
                            long j = B0;
                            if (w4) {
                                dVar.presentFragment(z ? ProfileActivity.P2(j) : mu1.U9(j));
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z) {
                                bundle.putLong("user_id", j);
                            } else {
                                bundle.putLong("chat_id", -j);
                            }
                            bundle.putInt("message_id", k27Var2.e1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (dVar.getMessagesController().A(bundle, dVar, null, null)) {
                                dVar.presentFragment(new mu1(bundle));
                            }
                        }
                    };
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.Q = charSequenceArr;
                    hdVar.R = iArr;
                    hdVar.N = onClickListener;
                    s47Var.showDialog(hdVar);
                    break;
                }
                break;
            default:
                an7 an7Var = (an7) obj;
                if (view instanceof zm7) {
                    zm7 zm7Var = (zm7) view;
                    an7Var.b0(zm7Var.e);
                    zm7Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // ni6
    public final Object e(Object obj, Object obj2) {
        return tne.b((List) ((Collection) obj2), new ji6(((xg7) this.b).f, obj));
    }

    @Override // sv6
    public final void f(ru6 ru6Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                Bundle bundle = Bundle.EMPTY;
                ru6Var.a(i, (p5a) obj);
                break;
            default:
                ru6Var.f(i, (kc8) obj);
                break;
        }
    }

    @Override // ix6
    public final void g(ad8 ad8Var, su6 su6Var) {
        ((us2) this.b).accept(ad8Var);
    }

    @Override // ac1
    public final long get() {
        return ((pj4) this.b).v();
    }

    @Override // a5c
    public final void h() {
        x6b x6bVar = (x6b) this.b;
        TextView textView = x6bVar.e1;
        boolean a = x6bVar.t0.a();
        ImageView imageView = x6bVar.d1;
        imageView.animate().cancel();
        imageView.animate().alpha(a ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a);
        textView.animate().cancel();
        textView.animate().alpha(a ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a);
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i;
        byte b = this.a;
        final byte b2 = 1;
        final byte b3 = 0;
        Object obj3 = this.b;
        switch (b) {
            case 11:
                p6b p6bVar = (p6b) obj3;
                c4c c4cVar = (c4c) obj;
                int i2 = c4cVar.d;
                f4b f4bVar = (f4b) c4cVar.H;
                p6bVar.c(false, true);
                t7b t7bVar = p6bVar.P;
                if (f4bVar != t7bVar.L1 && !t7bVar.Y1) {
                    t7bVar.e1.setSelected(i2);
                    t7bVar.Y1 = true;
                    on7 on7Var = new on7((Object) t7bVar, i2, (byte) 18);
                    x6b x6bVar = t7bVar.w1;
                    f4b f4bVar2 = t7bVar.L1;
                    if (x6bVar != null && f4bVar2 != null) {
                        if (x6bVar.r0()) {
                            f4bVar2.f();
                            Utilities.g.c(new g2a(t7bVar, x6bVar, f4bVar2.i0, f4bVar2.j0, f4bVar2, x6bVar.E0.getPainting().E, x6bVar.r0(), on7Var, (byte) 1));
                            break;
                        } else {
                            on7Var.run();
                            break;
                        }
                    } else {
                        on7Var.run();
                        break;
                    }
                }
                break;
            case 18:
                qq7 qq7Var = (qq7) obj3;
                c4c c4cVar2 = (c4c) obj;
                View view = (View) obj2;
                float floatValue = ((Float) serializable).floatValue();
                int i3 = c4cVar2.d;
                if (i3 == -1) {
                    boolean z = !qq7Var.d;
                    qq7Var.d = z;
                    ((ahb) view).setChecked(z);
                    qq7Var.a.g3.O(true);
                    qq7Var.Z(true);
                    break;
                } else {
                    byte b4 = 13;
                    if (i3 == -2) {
                        vob vobVar = new vob(null);
                        vobVar.n = qq7Var.n;
                        vobVar.c = new x15(qq7Var, view, b4);
                        qq7Var.presentFragment(vobVar);
                        break;
                    } else if (c4cVar2.a == 5 && i3 >= 0 && i3 < qq7Var.f.length) {
                        if (!k96.a0 ? floatValue < view.getMeasuredWidth() - gl.L(76.0f) : floatValue > gl.L(76.0f)) {
                            int i4 = (c4cVar2.d + 6) % 7;
                            int i5 = 0;
                            for (int i6 = 0; i6 < qq7Var.f[i4].size(); i6++) {
                                if (((pq7) qq7Var.f[i4].get(i6)).b > i5) {
                                    i5 = ((pq7) qq7Var.f[i4].get(i6)).b;
                                }
                            }
                            int max = Math.max(0, i5 - 1439);
                            int i7 = (c4cVar2.d + 1) % 7;
                            int i8 = 1440;
                            for (int i9 = 0; i9 < qq7Var.f[i7].size(); i9++) {
                                if (((pq7) qq7Var.f[i7].get(i9)).a < i8) {
                                    i8 = ((pq7) qq7Var.f[i7].get(i9)).a;
                                }
                            }
                            int i10 = i8 + 1439;
                            CharSequence charSequence = c4cVar2.m;
                            ArrayList arrayList = qq7Var.f[c4cVar2.d];
                            int i11 = 0;
                            for (int i12 = 0; i12 < 7; i12++) {
                                ArrayList arrayList2 = qq7Var.f[i12];
                                if (arrayList2 != null) {
                                    i11 += Math.max(1, arrayList2.size());
                                }
                            }
                            sq7 sq7Var = new sq7(charSequence, arrayList, max, i10, 28 - i11);
                            sq7Var.f = new oq7(qq7Var, b3);
                            sq7Var.h = new bj7(qq7Var, c4cVar2, b4);
                            qq7Var.presentFragment(sq7Var);
                            break;
                        } else {
                            if (qq7Var.f[c4cVar2.d].isEmpty()) {
                                ((vl7) view).setChecked(true);
                                qq7Var.f[c4cVar2.d].add(new pq7(0, 1439));
                                qq7Var.Y(c4cVar2.d);
                            } else {
                                qq7Var.f[c4cVar2.d].clear();
                                ((vl7) view).setChecked(false);
                            }
                            ((vl7) view).setValue(qq7.c0(qq7Var.f[c4cVar2.d]));
                            qq7Var.Z(true);
                            break;
                        }
                    }
                }
                break;
            case 19:
                final sq7 sq7Var2 = (sq7) obj3;
                c4c c4cVar3 = (c4c) obj;
                final View view2 = (View) obj2;
                int i13 = sq7Var2.c;
                int i14 = sq7Var2.d;
                ArrayList arrayList3 = sq7Var2.b;
                int i15 = c4cVar3.d;
                if (i15 == -1) {
                    sq7Var2.r = !sq7Var2.r;
                    arrayList3.clear();
                    if (sq7Var2.r) {
                        arrayList3.add(new pq7(0, 1439));
                    }
                    ahb ahbVar = (ahb) view2;
                    boolean z2 = sq7Var2.r;
                    c4cVar3.e = z2;
                    ahbVar.setChecked(z2);
                    boolean z3 = sq7Var2.r;
                    ahbVar.b(bkb.w0(null, z3 ? bkb.e6 : bkb.d6, false), z3);
                    sq7Var2.n.g3.O(true);
                    oq7 oq7Var = sq7Var2.f;
                    if (oq7Var != null) {
                        oq7Var.run();
                        break;
                    }
                } else if (i15 == -2) {
                    if (arrayList3.isEmpty() || sq7Var2.Y()) {
                        if (sq7Var2.Y()) {
                            arrayList3.clear();
                        }
                        int j = Utilities.j(480, i14 - 1, i13);
                        arrayList3.add(new pq7(j, Utilities.j(1200, i14, j + 1)));
                    } else {
                        int i16 = ((pq7) b00.f(1, arrayList3)).b;
                        int j2 = Utilities.j(i16 + 30, i14 - 1, i13);
                        arrayList3.add(new pq7(j2, Utilities.j((i16 + 1560) / 2, i14, j2 + 1)));
                    }
                    oq7 oq7Var2 = sq7Var2.f;
                    if (oq7Var2 != null) {
                        oq7Var2.run();
                    }
                    sq7Var2.n.g3.O(true);
                    break;
                } else if (c4cVar3.a == 3 && (i = i15 / 3) >= 0 && i < arrayList3.size()) {
                    int i17 = i - 1;
                    pq7 pq7Var = i17 >= 0 ? (pq7) arrayList3.get(i17) : null;
                    final pq7 pq7Var2 = (pq7) arrayList3.get(i);
                    int i18 = i + 1;
                    pq7 pq7Var3 = i18 < arrayList3.size() ? (pq7) arrayList3.get(i18) : null;
                    int i19 = c4cVar3.d % 3;
                    if (i19 == 0) {
                        Activity parentActivity = sq7Var2.getParentActivity();
                        String M0 = k96.M0(2131752738, null);
                        int i20 = pq7Var2.a;
                        if (pq7Var != null) {
                            i13 = pq7Var.b + 1;
                        }
                        ij.U(parentActivity, M0, i20, i13, pq7Var2.b - 1, new p8c() { // from class: rq7
                            @Override // p8c
                            public final void a(Object obj4) {
                                byte b5 = b3;
                                pq7 pq7Var4 = pq7Var2;
                                View view3 = view2;
                                sq7 sq7Var3 = sq7Var2;
                                Integer num = (Integer) obj4;
                                switch (b5) {
                                    case 0:
                                        boolean Z = sq7Var3.Z();
                                        int intValue = num.intValue();
                                        pq7Var4.a = intValue;
                                        ((wgb) view3).w(pq7.a(intValue), true);
                                        if (Z != sq7Var3.Z()) {
                                            sq7Var3.n.g3.O(true);
                                        }
                                        oq7 oq7Var3 = sq7Var3.f;
                                        if (oq7Var3 != null) {
                                            oq7Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        boolean Z2 = sq7Var3.Z();
                                        int intValue2 = num.intValue();
                                        pq7Var4.b = intValue2;
                                        ((wgb) view3).w(pq7.a(intValue2), true);
                                        if (Z2 != sq7Var3.Z()) {
                                            sq7Var3.n.g3.O(true);
                                        }
                                        oq7 oq7Var4 = sq7Var3.f;
                                        if (oq7Var4 != null) {
                                            oq7Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i19 == 1) {
                        Activity parentActivity2 = sq7Var2.getParentActivity();
                        String M02 = k96.M0(2131752744, null);
                        int i21 = pq7Var2.b;
                        int i22 = pq7Var2.a + 1;
                        if (pq7Var3 != null) {
                            i14 = pq7Var3.a - 1;
                        }
                        ij.U(parentActivity2, M02, i21, i22, i14, new p8c() { // from class: rq7
                            @Override // p8c
                            public final void a(Object obj4) {
                                byte b5 = b2;
                                pq7 pq7Var4 = pq7Var2;
                                View view3 = view2;
                                sq7 sq7Var3 = sq7Var2;
                                Integer num = (Integer) obj4;
                                switch (b5) {
                                    case 0:
                                        boolean Z = sq7Var3.Z();
                                        int intValue = num.intValue();
                                        pq7Var4.a = intValue;
                                        ((wgb) view3).w(pq7.a(intValue), true);
                                        if (Z != sq7Var3.Z()) {
                                            sq7Var3.n.g3.O(true);
                                        }
                                        oq7 oq7Var3 = sq7Var3.f;
                                        if (oq7Var3 != null) {
                                            oq7Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        boolean Z2 = sq7Var3.Z();
                                        int intValue2 = num.intValue();
                                        pq7Var4.b = intValue2;
                                        ((wgb) view3).w(pq7.a(intValue2), true);
                                        if (Z2 != sq7Var3.Z()) {
                                            sq7Var3.n.g3.O(true);
                                        }
                                        oq7 oq7Var4 = sq7Var3.f;
                                        if (oq7Var4 != null) {
                                            oq7Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i19 == 2) {
                        arrayList3.remove(i);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new pq7(0, 1439));
                        }
                        sq7Var2.n.g3.O(true);
                        oq7 oq7Var3 = sq7Var2.f;
                        if (oq7Var3 != null) {
                            oq7Var3.run();
                            break;
                        }
                    }
                }
                break;
            default:
                ((PasskeysActivity) obj3).c0((c4c) obj, (View) obj2);
                break;
        }
    }

    @Override // d4b
    public final Bitmap l(BitmapFactory.Options options) {
        jm6 jm6Var = (jm6) this.b;
        String str = jm6Var.i;
        if (str == null) {
            str = jm6Var.I;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override // js4
    public final Object m(Object obj) {
        return Float.valueOf(((ti4) this.b).a / 100.0f);
    }

    @Override // y48
    public final void n(int i, int i2) {
        l58 l58Var = (l58) ((s20) this.b).e;
        if (i == l58Var.b) {
            l58Var.H = i2;
        } else if (i == l58Var.r) {
            l58Var.Q = i2;
        } else if (i == l58Var.d) {
            l58Var.J = i2;
        } else if (i == l58Var.c) {
            l58Var.I = i2;
        } else if (i == l58Var.f) {
            l58Var.K = i2;
        } else if (i == l58Var.e) {
            l58Var.L = i2;
        } else if (i == l58Var.w) {
            l58Var.S = i2;
        } else if (i == l58Var.s) {
            l58Var.R = i2;
        } else if (i == l58Var.x) {
            l58Var.T = i2;
        } else if (i == l58Var.y) {
            l58Var.V = i2;
        } else if (i == l58Var.h) {
            l58Var.M = i2;
        } else if (i == l58Var.n) {
            l58Var.N = i2;
        }
        td4 td4Var = l58Var.m0;
        if (td4Var != null) {
            td4Var.b(true, false, false);
        }
        l58Var.e();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        e68 e68Var = (e68) this.b;
        e68Var.E0 = true;
        e68Var.D0 = false;
    }

    @Override // lx6
    public final Object p(tv6 tv6Var, su6 su6Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                ix6 ix6Var = (ix6) obj;
                if (tv6Var.i()) {
                    return am5.b;
                }
                tv6Var.t();
                ix6Var.g(tv6Var.t, su6Var);
                ox6.W(tv6Var, su6Var, i, new o6a(0));
                return am5.b;
            default:
                return tv6Var.o(su6Var, mm5.u((br6) obj), -1, -9223372036854775807L);
        }
    }

    @Override // yr9
    public final void r(int i) {
        sm7 sm7Var = (sm7) this.b;
        if (sm7Var.f == null && !sm7Var.h.e()) {
            sm7Var.n.c.c();
        }
        sm7Var.f();
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        t47 t47Var = (t47) this.b;
        if (z) {
            long j = i;
            if (t47Var.w1 != j) {
                t47Var.w1 = j;
                t47Var.q1.setText(t47.F0(j));
            }
            t47Var.E0(true);
        }
    }

    @Override // yr9
    public final vf6 t1() {
        return null;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        jj9 jj9Var;
        byte b = this.a;
        byte b2 = 0;
        Object obj = this.b;
        switch (b) {
            case 15:
                ((um7) obj).run();
                break;
            case 17:
                an7 an7Var = ((xm7) obj).b;
                SparseArray sparseArray = an7Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    ym7 ym7Var = (ym7) sparseArray.valueAt(i2);
                    TLRPC.Document document = ym7Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        ij9 ij9Var = an7Var.getMediaDataController().A0;
                        TLRPC.Document document2 = ym7Var.e;
                        ArrayList arrayList2 = ij9Var.e;
                        if (document2 != null) {
                            if (!ij9Var.f) {
                                ij9Var.f(true);
                                ij9Var.f = true;
                            }
                            int i3 = 0;
                            while (true) {
                                if (i3 < arrayList2.size()) {
                                    if (((hj9) arrayList2.get(i3)).a == null || ((hj9) arrayList2.get(i3)).a.id != document2.id) {
                                        i3++;
                                    } else {
                                        arrayList2.remove(i3);
                                    }
                                }
                            }
                        }
                    }
                    if (ym7Var.g != null && (jj9Var = (jj9) an7Var.getMediaDataController().a0.get(ym7Var.g)) != null) {
                        jj9Var.c = true;
                        jj9Var.a();
                        int i4 = jj9Var.a;
                        ba4 G = ba4.G(i4);
                        String str = jj9Var.b;
                        G.b(str, false);
                        hq6.d0(i4).j1(str, null, true);
                    }
                    if (ym7Var == an7Var.H) {
                        an7Var.N = null;
                        an7Var.H = (ym7) an7Var.b.get(0);
                        an7Var.I = true;
                    }
                    an7Var.a.remove(ym7Var);
                    an7Var.c.remove(ym7Var);
                }
                an7Var.getMediaDataController().A0.h();
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i5);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.id = tL_inputDocument;
                    tL_inputDocument.id = document3.id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    an7Var.getConnectionsManager().sendRequest(saveringtone, new ce2(b2));
                }
                an7Var.c0();
                an7Var.h0();
                an7Var.e.f();
                hdVar.dismiss();
                break;
            case 22:
                ((qt7) obj).a.j2.q();
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                gba.r = "";
                gba.w = false;
                gba.x();
                passcodeActivity.getMediaDataController().o();
                int childCount = passcodeActivity.c.getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 < childCount) {
                        View childAt = passcodeActivity.c.getChildAt(i6);
                        if (childAt instanceof uib) {
                            zkb.X(((uib) childAt).getTextView(), bkb.D6, null);
                        } else {
                            i6++;
                        }
                    }
                }
                kk7.e().k(50, new Object[0]);
                passcodeActivity.finishFragment();
                break;
        }
    }

    public /* synthetic */ im6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // e36
    public final void a() {
    }

    @Override // e36
    public final void i() {
    }

    @Override // e36
    public final void k() {
    }

    @Override // yr9
    public final void m2(ArrayList arrayList) {
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
    }
}

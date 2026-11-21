package ab;

import a8.r7;
import ai.x1;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.RectF;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.c4;
import bi.e8;
import bi.i8;
import bi.j8;
import bi.k2;
import bi.n6;
import bi.o1;
import bi.s6;
import bi.u5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import di.j2;
import di.m4;
import di.y8;
import fi.f9;
import fi.r3;
import fi.x0;
import fi.x3;
import fi.z3;
import hi.b8;
import hi.d8;
import hi.k8;
import hi.p8;
import hi.r8;
import hi.t7;
import hi.v7;
import hi.y7;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import jg.h1;
import kg.c1;
import ki.h3;
import oi.f1;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.t10;
import org.telegram.messenger.tr;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ia0;
import org.telegram.ui.na0;
import org.telegram.ui.oa1;
import org.telegram.ui.qa0;
import org.telegram.ui.t01;
import org.telegram.ui.ul0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements OnCompleteListener, Continuation, q1, m4, v10, rj0, OnFailureListener, u9.d, t01, CameraView.CameraViewDelegate, jh.i, oa1, v7, t10, na0, sj0, h2.p, h2.o, oi.l0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // di.m4
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        n6 n6Var = (n6) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        gq0 gq0Var = n6Var.a;
        n6Var.e.l.remove(savedStarGift);
        n6Var.f(true);
        int i7 = n6Var.b;
        if (j3 == j10.i(i7).e()) {
            lc b02 = lc.b0(gq0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String N0 = gd.N0(2131752875, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            gc O = b02.O(document, N0, gd.a0(null, null, 2131752876, i5.c.l(tL_starGiftUnique.num, ',', sb2)));
            O.r = false;
            O.j();
        } else {
            gc O2 = lc.b0(gq0Var.a).O(tL_starGiftUnique.getDocument(), gd.N0(2131752873, null), gd.a0(null, null, 2131752874, n5.s(i7, j3)));
            O2.r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.w0.c(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r4 = r1.J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r2.y = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r4 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r2.y = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r1 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r2.c = true;
        r1.setText(r2.y);
        r1 = r2.e;
        r1.setSelection(r1.getText().length());
        r2.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r2.d0();
        r2.a.g3.O(true);
        r2.Z(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        if (r2.E != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (android.text.TextUtils.isEmpty(r1 != null ? r1.J : null) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2.E = true;
        r1 = r3.Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r1 == null) goto L15;
     */
    @Override // org.telegram.ui.na0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        c1 c1Var = (c1) this.b;
        qa0 qa0Var = (qa0) this.c;
        c1Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(c1Var.y)) {
            ia0 ia0Var = qa0Var.Q;
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        return h3.E0((h3) this.b, (Context) this.c, view, i7);
    }

    @Override // jh.i
    public void d(View view, RectF rectF) {
        fh.g gVar = (fh.g) this.b;
        WeakReference weakReference = (WeakReference) this.c;
        gVar.i(rectF.left, rectF.top);
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // u9.d
    public Object e(r7 r7Var) {
        String valueOf;
        switch (this.a) {
            case 8:
                String str = (String) this.b;
                n2.a0 a0Var = (n2.a0) this.c;
                Context context = (Context) r7Var.a(Context.class);
                switch (a0Var.a) {
                    case 9:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 10:
                        valueOf = FirebaseCommonRegistrar.a(context);
                        break;
                    case 11:
                        int i7 = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i7 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        valueOf = "embedded";
                                        break;
                                    }
                                    valueOf = "";
                                    break;
                                } else {
                                    valueOf = "auto";
                                    break;
                                }
                            } else {
                                valueOf = "watch";
                                break;
                            }
                        } else {
                            valueOf = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            valueOf = FirebaseCommonRegistrar.b(installerPackageName);
                            break;
                        }
                        valueOf = "";
                        break;
                }
                return new cb.a(str, valueOf);
            default:
                String str2 = (String) this.b;
                u9.a aVar = (u9.a) this.c;
                try {
                    Trace.beginSection(str2);
                    return aVar.f.e(r7Var);
                } finally {
                    Trace.endSection();
                }
        }
    }

    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.String, org.telegram.ui.ActionBar.q1] */
    @Override // org.telegram.ui.Components.rj0
    public void f(float f10, float f11, int i7, View view) {
        TL_stars.SavedStarGift savedStarGift;
        AlertDialog$Builder alertDialog$Builder;
        ?? r42;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 6:
                j8 j8Var = (j8) obj2;
                i8 i8Var = (i8) obj;
                o41 G = j8Var.e2.G(i7 - 1);
                if (G != null) {
                    Object obj3 = G.H;
                    if (obj3 instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj3;
                        boolean z10 = G.s;
                        if (!TextUtils.isEmpty(starGift.gift_address) && j8Var.d2 && !((org.telegram.messenger.h0) mp.u1(j8Var.a).A7.x.b).c) {
                            alertDialog$Builder = new AlertDialog$Builder(0, j8Var.getContext(), j8Var.J0);
                            r42 = 0;
                            String N0 = gd.N0(2131749775, null);
                            t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = N0;
                            t1Var.U = gd.N0(2131749776, null);
                        } else if (!z10 || !(starGift instanceof TL_stars.TL_starGiftUnique)) {
                            if (!z10) {
                                ArrayList arrayList2 = i8Var.b.l;
                                int size = arrayList2.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 < size) {
                                        Object obj4 = arrayList2.get(i11);
                                        i11++;
                                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj4;
                                        if (savedStarGift2.gift == starGift) {
                                            savedStarGift = savedStarGift2;
                                        }
                                    } else {
                                        savedStarGift = null;
                                    }
                                }
                                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(j8Var.a).getCurrentTime()) {
                                    alertDialog$Builder = new AlertDialog$Builder(j8Var.getContext());
                                    r42 = 0;
                                    String N02 = gd.N0(2131749738, null);
                                    t1 t1Var2 = alertDialog$Builder.a;
                                    t1Var2.S = N02;
                                    t1Var2.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749739, gd.x(savedStarGift.can_craft_at, true)));
                                }
                            }
                            j8Var.b2.a(starGift);
                            j8Var.dismiss();
                            break;
                        } else {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.H;
                            t1 t1Var3 = new t1(3, j8Var.getContext(), null);
                            t1Var3.r(400L);
                            long e10 = j10.i(j8Var.a).e();
                            cg.b bVar = tL_starGiftUnique.resale_ton_only ? cg.b.b : cg.b.a;
                            y8.x(j8Var.a, bVar).H(tL_starGiftUnique, e10, null, true, new e8(j8Var, t1Var3, bVar, tL_starGiftUnique, e10));
                            break;
                        }
                        f3.m(r42, 2131747637, alertDialog$Builder, r42);
                        break;
                    }
                }
                break;
            default:
                k8 k8Var = (k8) obj2;
                Context context = (Context) obj;
                ArrayList arrayList3 = k8Var.M;
                a0.h hVar = k8Var.b;
                d8 d8Var = k8Var.y;
                ArrayList arrayList4 = k8Var.c;
                HashMap hashMap = k8Var.d;
                p8 p8Var = k8Var.a0;
                m2 m2Var = p8Var.c;
                if (i7 >= 0 && i7 < arrayList3.size()) {
                    y7 y7Var = (y7) arrayList3.get(i7);
                    int i12 = y7Var.a;
                    if (i12 != 3) {
                        if (i12 != 7) {
                            int i13 = 9;
                            if (i12 == 9) {
                                int i14 = y7Var.q;
                                if (i14 != 0) {
                                    if (i14 != 1) {
                                        if (i14 != 5) {
                                            if (i14 == 6) {
                                                p8Var.B1 = false;
                                                k8Var.h(true);
                                                break;
                                            }
                                        } else {
                                            Context context2 = k8Var.getContext();
                                            int i15 = p8.Y1;
                                            t1 t1Var4 = new t1(3, context2, p8Var.J0);
                                            t1Var4.r(500L);
                                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                            getgroupcallstreamrtmpurl.live_story = true;
                                            TLRPC.InputPeer inputPeer = p8Var.n1;
                                            if (inputPeer == null) {
                                                inputPeer = new TLRPC.TL_inputPeerSelf();
                                            }
                                            getgroupcallstreamrtmpurl.peer = inputPeer;
                                            ConnectionsManager.getInstance(p8Var.a).sendRequest(getgroupcallstreamrtmpurl, new bi.q1(k8Var, t1Var4, getgroupcallstreamrtmpurl, i13));
                                            break;
                                        }
                                    } else {
                                        TLRPC.InputPeer inputPeer2 = p8Var.n1;
                                        long n10 = inputPeer2 != null ? n5.n(inputPeer2) : j10.i(p8Var.a).e();
                                        a70 G2 = a70.G(k8Var, p8Var.J0, view);
                                        G2.c(R.drawable.msg_addfolder, gd.N0(2131744544, null), new c4(k8Var, n10, 8), false);
                                        G2.k();
                                        a70.f(G2, mp.u1(p8Var.a).R1().B(n10, true), p8Var.v1, false, null, new x1(19, k8Var, G2));
                                        G2.a0();
                                        break;
                                    }
                                } else {
                                    r8 r8Var = p8Var.X1;
                                    if (r8Var != null) {
                                        r8Var.run();
                                        break;
                                    }
                                }
                            }
                        } else if (view instanceof n8) {
                            n8 n8Var = (n8) view;
                            n8Var.setChecked(!n8Var.d());
                            y7Var.k = n8Var.d();
                            int i16 = y7Var.c;
                            if (i16 != 0) {
                                if (i16 != 1) {
                                    if (i16 == 2) {
                                        p8Var.w1 = n8Var.d();
                                        k8Var.h(true);
                                        break;
                                    }
                                } else {
                                    boolean d = n8Var.d();
                                    p8Var.y1 = d;
                                    boolean z11 = p8Var.n1 instanceof TLRPC.TL_inputPeerChannel;
                                    if (d) {
                                        gc G3 = new lc(m2Var, p8Var.J0).G(R.raw.msg_story_keep, 4, gd.N0(z11 ? 2131744466 : 2131744430, null));
                                        G3.j = 5000;
                                        G3.k(true);
                                    } else {
                                        gc G4 = new lc(m2Var, p8Var.J0).G(R.raw.fire_on, 4, gd.N0(z11 ? 2131744467 : 2131744444, null));
                                        G4.j = 5000;
                                        G4.k(true);
                                    }
                                    k8Var.h(true);
                                    break;
                                }
                            } else {
                                boolean d2 = n8Var.d();
                                p8Var.x1 = d2;
                                r10 = p8Var.I1 == 4 ? 1 : 0;
                                if (!d2) {
                                    gc G5 = new lc(m2Var, p8Var.J0).G(R.raw.passcode_lock_close, 4, gd.N0(r10 != 0 ? 2131744442 : 2131744443, null));
                                    G5.j = 5000;
                                    G5.k(true);
                                    break;
                                } else {
                                    gc G6 = new lc(m2Var, p8Var.J0).G(R.raw.ic_save_to_gallery, 4, gd.N0(r10 != 0 ? 2131744428 : 2131744429, null));
                                    G6.j = 5000;
                                    G6.k(true);
                                    break;
                                }
                            }
                        }
                    } else if (!y7Var.n || !p8Var.A1) {
                        int i17 = y7Var.i;
                        if (i17 != 1) {
                            if (i17 != 3) {
                                if (i17 != 2) {
                                    if (i17 != 4) {
                                        if (i17 > 0) {
                                            arrayList4.clear();
                                            hashMap.clear();
                                            p8Var.I1 = y7Var.i;
                                            d8Var.d.a();
                                        } else {
                                            TLRPC.Chat chat = y7Var.h;
                                            if (chat != null) {
                                                long j3 = chat.id;
                                                if (p8.L0(p8Var, chat) > 200) {
                                                    try {
                                                        k8Var.performHapticFeedback(3, 1);
                                                    } catch (Throwable unused) {
                                                    }
                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, k8Var.getContext(), p8Var.J0);
                                                    String N03 = gd.N0(2131749201, null);
                                                    t1 t1Var5 = alertDialog$Builder2.a;
                                                    t1Var5.S = N03;
                                                    t1Var5.U = gd.N0(2131749200, null);
                                                    f3.m(null, 2131747637, alertDialog$Builder2, null);
                                                } else if (hashMap.containsKey(Long.valueOf(j3))) {
                                                    ArrayList arrayList5 = (ArrayList) hashMap.get(Long.valueOf(j3));
                                                    if (arrayList5 != null) {
                                                        int size2 = arrayList5.size();
                                                        while (r10 < size2) {
                                                            Object obj5 = arrayList5.get(r10);
                                                            r10++;
                                                            hVar.k(Boolean.FALSE, ((Long) obj5).longValue());
                                                        }
                                                    }
                                                    hashMap.remove(Long.valueOf(j3));
                                                    k8Var.j(true);
                                                } else {
                                                    TLRPC.Chat O0 = mp.u1(p8Var.a).O0(Long.valueOf(j3));
                                                    TLRPC.ChatFull P0 = mp.u1(p8Var.a).P0(j3);
                                                    if (P0 == null || (chatParticipants = P0.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || P0.participants.participants.size() < P0.participants_count - 1) {
                                                        t1 t1Var6 = k8Var.H;
                                                        if (t1Var6 != null) {
                                                            t1Var6.dismiss();
                                                            k8Var.H = null;
                                                        }
                                                        k8Var.I = j3;
                                                        t1 t1Var7 = new t1(3, k8Var.getContext(), p8Var.J0);
                                                        k8Var.H = t1Var7;
                                                        t1Var7.r(50L);
                                                        tr a02 = tr.a0(p8Var.a);
                                                        a02.a.c(new j2(k8Var, O0, a02, j3, 11));
                                                    } else {
                                                        k8Var.e(j3, P0.participants);
                                                    }
                                                    if (!TextUtils.isEmpty(k8Var.J)) {
                                                        d8Var.setText("");
                                                        k8Var.J = null;
                                                        k8Var.h(false);
                                                    }
                                                }
                                            } else {
                                                TLRPC.User user = y7Var.g;
                                                if (user != null) {
                                                    if (k8Var.a == 0) {
                                                        p8Var.I1 = 0;
                                                    }
                                                    long j10 = user.id;
                                                    HashSet hashSet = new HashSet(arrayList4);
                                                    if (arrayList4.contains(Long.valueOf(j10))) {
                                                        Iterator it = hashMap.entrySet().iterator();
                                                        while (it.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it.next();
                                                            if (((ArrayList) entry.getValue()).contains(Long.valueOf(j10))) {
                                                                it.remove();
                                                                hashSet.addAll((Collection) entry.getValue());
                                                            }
                                                        }
                                                        hashSet.remove(Long.valueOf(j10));
                                                        hVar.k(Boolean.FALSE, j10);
                                                    } else {
                                                        Iterator it2 = hashMap.entrySet().iterator();
                                                        while (it2.hasNext()) {
                                                            Map.Entry entry2 = (Map.Entry) it2.next();
                                                            if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j10))) {
                                                                it2.remove();
                                                                hashSet.addAll((Collection) entry2.getValue());
                                                            }
                                                        }
                                                        hashSet.add(Long.valueOf(j10));
                                                        if (!TextUtils.isEmpty(k8Var.J)) {
                                                            d8Var.setText("");
                                                            k8Var.J = null;
                                                            k8Var.h(false);
                                                        }
                                                        hVar.k(Boolean.TRUE, j10);
                                                    }
                                                    arrayList4.clear();
                                                    arrayList4.addAll(hashSet);
                                                    k8Var.j(true);
                                                }
                                            }
                                        }
                                        k8Var.g(true);
                                        k8Var.f(true);
                                        d8Var.M = true;
                                        break;
                                    } else {
                                        if (p8Var.I1 == 4) {
                                            p8Var.H1 = 4;
                                            p8Var.m1.A(1);
                                        }
                                        p8Var.I1 = 4;
                                        k8Var.g(true);
                                        break;
                                    }
                                } else {
                                    if (p8Var.I1 == 2) {
                                        p8Var.H1 = 2;
                                        p8Var.m1.A(1);
                                    }
                                    p8Var.I1 = 2;
                                    k8Var.g(true);
                                    break;
                                }
                            } else {
                                if (p8Var.I1 == 3 || (p8Var.s1.isEmpty() && p8Var.t1.isEmpty())) {
                                    p8Var.H1 = 3;
                                    p8Var.m1.A(1);
                                }
                                p8Var.I1 = 3;
                                k8Var.g(true);
                                break;
                            }
                        } else {
                            if (p8Var.I1 == 1 || p8.K0(p8Var).isEmpty()) {
                                p8Var.H1 = 1;
                                p8Var.m1.A(1);
                            }
                            p8Var.I1 = 1;
                            k8Var.g(true);
                            break;
                        }
                    } else {
                        new t7(context, p8Var.a, p8Var.F1, p8Var.n1, new b8(k8Var, r10), p8Var.J0).show();
                        break;
                    }
                }
                break;
        }
    }

    @Override // hi.v7
    public void g(hi.n8 n8Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i7, hi.c cVar, hi.l lVar) {
        switch (this.a) {
            case 15:
                z3 z3Var = (z3) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = mp.u1(z3Var.m2).l1(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = n8Var.b;
                ConnectionsManager.getInstance(z3Var.m2).sendRequest(tL_stories_editStory, new k2(z3Var, cVar, storyItem, n8Var, 6));
                break;
            default:
                r3 r3Var = (r3) this.b;
                p8 p8Var = (p8) this.c;
                z3 z3Var2 = r3Var.x;
                x3 x3Var = z3Var2.y1;
                TL_stories.StoryItem storyItem2 = x3Var.a;
                if ((storyItem2 != null && storyItem2.pinned) != z12) {
                    mp.u1(z3Var2.m2).R1().r0(z3Var2.l1, z3Var2.f1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = x3Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(z3Var2.m2).sendRequest(togglegroupcallsettings, new o1(11, r3Var, p8Var));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        switch (this.a) {
            case 2:
                bi.y yVar = (bi.y) this.b;
                bi.u uVar = (bi.u) this.c;
                try {
                    int parseInt = Integer.parseInt(uVar.getText().toString().trim());
                    yVar.h1(parseInt);
                    yVar.Y1.setValue(parseInt);
                    t1Var.dismiss();
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.D3(uVar);
                    a8.g(th2, true);
                    return;
                }
            case 3:
                u5 u5Var = (u5) this.b;
                x10 x10Var = (x10) this.c;
                String obj = u5Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    x10Var.a(obj);
                    t1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.D3(u5Var);
                    break;
                }
                break;
            case 17:
                r3 r3Var = (r3) this.b;
                fi.c1 c1Var = ((f9) this.c).B0;
                if (c1Var == null) {
                    z3.d0(r3Var.x);
                    break;
                } else if (!c1Var.x) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = c1Var.f;
                    ConnectionsManager.getInstance(c1Var.e).sendRequest(discardgroupcall, new x0(c1Var, 4));
                    c1Var.e();
                    break;
                }
                break;
            case 19:
                h1 h1Var = (h1) this.b;
                boolean[] zArr = (boolean[]) this.c;
                h1Var.getClass();
                zArr[0] = true;
                h1Var.Q();
                break;
            case 22:
                kg.z.d(r5.currentAccount).a((kg.v) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
            default:
                h3.B0((h3) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
        }
    }

    @Override // h2.p
    public void i(Object obj, e2.s sVar) {
        m2.b bVar = (m2.b) obj;
        bVar.A((e2.c1) this.c, new ji.l(sVar, ((m2.d) this.b).e));
    }

    @Override // h2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 27:
                ((m2.b) obj).r((m2.a) this.b, (x2.c0) this.c);
                break;
            default:
                ((m2.b) obj).onRenderedFirstFrame((m2.a) this.b);
                break;
        }
    }

    @Override // oi.l0
    public a70 j(f1 f1Var) {
        k8.a aVar = (k8.a) this.b;
        h6 h6Var = (h6) this.c;
        oi.o oVar = (oi.o) aVar.c;
        a70 a70Var = new a70(oVar, h6Var, f1Var, false, false, true);
        oVar.I = a70Var;
        return a70Var;
    }

    @Override // org.telegram.ui.oa1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((di.t) this.b).v0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        s6 s6Var = (s6) this.b;
        hi.e eVar = (hi.e) this.c;
        View view = (View) obj2;
        long j3 = ((TL_stars.SavedStarGift) ((o41) obj).H).gift.id;
        if (s6Var.m1 == j3) {
            s6Var.m1 = 0L;
        } else {
            s6Var.m1 = j3;
        }
        eVar.setEnabled(s6Var.m1 != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof ul0) {
                    ul0 ul0Var = (ul0) childAt;
                    ul0Var.b(s6Var.m1 == ul0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // org.telegram.messenger.t10
    public void m(Object obj, TLRPC.Document document, Boolean bool) {
        kg.n nVar = (kg.n) this.b;
        View view = (View) this.c;
        nVar.x = false;
        org.telegram.messenger.g0.r(nVar.e);
        kg.i iVar = nVar.n;
        nVar.y = document;
        iVar.setSticker(document);
        ((n8) view).setValueSticker(document);
        nVar.j0(true);
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        ci.b0 b0Var = (ci.b0) this.b;
        ((CameraView) this.c).animate().alpha(1.0f).setDuration(180L).start();
        if (b0Var.W || b0Var.i0 || b0Var.m0) {
            return;
        }
        b0Var.i0 = true;
        b0Var.h0.postDelayed(b0Var.z0, 150L);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((h) this.b).a((Intent) this.c);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e10) {
        w0.i gVar;
        switch (this.a) {
            case 7:
                c1.f fVar = (c1.f) this.b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                kotlin.jvm.internal.j.e(e10, "e");
                String str = ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str2 = "During begin sign in, failure response from one tap: " + e10.getMessage();
                int hashCode = str.hashCode();
                if (hashCode == -1567968963) {
                    if (str.equals("GET_CANCELED_TAG")) {
                        gVar = new w0.g(str2);
                    }
                    gVar = new w0.h(2, str2);
                } else if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        gVar = new w0.k(str2);
                    }
                    gVar = new w0.h(2, str2);
                } else {
                    if (str.equals("GET_INTERRUPTED")) {
                        gVar = new w0.j(str2);
                    }
                    gVar = new w0.h(2, str2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal)) {
                    return;
                }
                fVar.g().execute(new c1.b(fVar, gVar, 0));
                return;
            default:
                d1.e eVar = (d1.e) this.b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.c;
                kotlin.jvm.internal.j.e(e10, "e");
                String str3 = ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String str4 = "During create public key credential, fido registration failure: " + e10.getMessage();
                w0.d bVar = str3.equals("CREATE_CANCELED") ? new w0.b(str4) : str3.equals("CREATE_INTERRUPTED") ? new w0.e(str4) : new w0.c(2, str4);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal2)) {
                    return;
                }
                Executor executor = eVar.g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar, bVar, 1));
                    return;
                } else {
                    kotlin.jvm.internal.j.h("executor");
                    throw null;
                }
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        k kVar = (k) this.b;
        String str = (String) this.c;
        synchronized (kVar) {
            ((a0.f) kVar.b).remove(str);
        }
        return task;
    }

    public /* synthetic */ g(m2.a aVar, Object obj, long j3) {
        this.a = 28;
        this.b = aVar;
        this.c = obj;
    }

    private final /* synthetic */ void n(View view, float f10, float f11) {
    }

    private final /* synthetic */ void o(View view, float f10, float f11) {
    }
}

package d3;

import a8.p0;
import android.os.SystemClock;
import android.util.Log;
import di.f6;
import di.fb;
import di.j2;
import di.n3;
import fi.t0;
import h2.l0;
import hi.p7;
import hi.r7;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.mp;
import org.telegram.messenger.sr;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.w91;
import zi.q0;
import zi.u0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e0(t0 t0Var, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10) {
        this.a = 2;
        this.d = t0Var;
        this.b = j3;
        this.e = tL_textWithEntities;
        this.c = j10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:40|41|42|44|45|46|(19:49|50|(1:109)(1:54)|55|(1:57)(1:108)|58|(1:(2:60|(1:62)(1:63))(2:106|107))|64|(1:66)(1:105)|67|(4:71|(2:78|(1:84))|101|(1:100)(3:81|82|84))|86|87|88|(1:90)(1:95)|91|92|93|47)|113|86|87|88|(0)(0)|91|92|93) */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x021f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020d A[Catch: all -> 0x021f, TryCatch #4 {all -> 0x021f, blocks: (B:88:0x0203, B:90:0x020d, B:91:0x0223), top: B:87:0x0203 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0221  */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.util.ArrayList] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long[] jArr;
        long[] jArr2;
        android.support.v4.media.session.a0 a0Var;
        int i7;
        String str;
        int i10;
        long j3;
        int i11;
        String str2;
        android.support.v4.media.session.a0 t6;
        android.support.v4.media.session.a0 a0Var2 = null;
        int i12 = 0;
        int i13 = 1;
        switch (this.a) {
            case 0:
                wf.b bVar = (wf.b) this.d;
                String str3 = (String) this.e;
                long j10 = this.b;
                long j11 = this.c;
                h0 h0Var = (h0) bVar.c;
                String str4 = l0.a;
                m2.d dVar = ((l2.a0) h0Var).a.s;
                m2.a U = dVar.U();
                dVar.V(U, 1016, new li.c(U, str3, j11, j10, 20));
                return;
            case 1:
                f6 f6Var = (f6) this.d;
                fb fbVar = new fb(f6Var.getContext(), f6Var.J0, this.b, 11, null, new j2(f6Var, new boolean[]{false}, this.c, (w10) this.e, 2), 0L);
                fbVar.setOnDismissListener(new n3(f6Var, 1));
                fbVar.show();
                return;
            case 2:
                ((t0) this.d).n(this.b, (TLRPC.TL_textWithEntities) this.e, this.c);
                return;
            case 3:
                r7 r7Var = (r7) this.d;
                long j12 = this.b;
                long j13 = this.c;
                p7 p7Var = (p7) this.e;
                try {
                    jArr = new long[]{j12};
                    try {
                        jArr2 = r7.y;
                        a0Var = null;
                        i7 = 0;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    a0Var2 = null;
                }
                while (i7 < 2) {
                    try {
                        long j14 = jArr2[i7];
                        int i14 = (j13 <= j12 || j13 > (j12 + j14) + 500) ? i12 : i13;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (i14 != 0) {
                            i10 = i7;
                            j3 = j13;
                        } else {
                            i10 = i7;
                            j3 = j12 + j14;
                        }
                        float[] b10 = r7Var.b(p7Var, j12, j3, jArr);
                        float f10 = 0.0f;
                        ?? r23 = a0Var2;
                        int i15 = i12;
                        while (true) {
                            if (b10 != null) {
                                i11 = i12;
                                if (i15 < b10.length) {
                                    f10 = Math.max(f10, Math.abs(b10[i15]));
                                    i15 += 7;
                                    i12 = i11;
                                }
                            } else {
                                i11 = i12;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("captions: ");
                        if (b10 == null) {
                            str2 = "no audio";
                        } else {
                            str2 = (b10.length / 16) + " ms of audio (peak " + Math.round(f10 * 100.0f) + "%)";
                        }
                        sb2.append(str2);
                        sb2.append(" from ");
                        sb2.append(j12);
                        sb2.append(" ms, decoded in ");
                        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        sb2.append(" ms");
                        Log.d("Dictation", sb2.toString());
                        if (b10 != null && !r7Var.h) {
                            ai.q[] qVarArr = DictationAsr.a;
                            DictationLid.d(org.telegram.messenger.t0.b);
                            android.support.v4.media.session.a0 W = DictationAsr.W(r23);
                            if (W != null && b10.length != 0 && (t6 = DictationAsr.t(b10, W)) != W) {
                                a0Var = t6;
                                if (a0Var == null && i14 == 0 && b10.length / 16 >= j14 - 2000) {
                                    i7 = i10 + 1;
                                    a0Var2 = r23;
                                    i12 = i11;
                                    i13 = 1;
                                }
                            }
                            a0Var = r23;
                            if (a0Var == null) {
                                i7 = i10 + 1;
                                a0Var2 = r23;
                                i12 = i11;
                                i13 = 1;
                            }
                        }
                        a0Var2 = a0Var;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("captions: ");
                        if (a0Var2 == null) {
                            str = "can be made, " + a0Var2;
                        } else {
                            str = "can't be made (no speech in a language with a model)";
                        }
                        sb3.append(str);
                        Log.d("Dictation", sb3.toString());
                    } catch (Throwable th4) {
                        th = th4;
                        a0Var2 = a0Var;
                        Log.e("Dictation", "captions: can't hear the video", th);
                        a8.g(th, true);
                        org.telegram.messenger.g0.g3(new hi.c(15, r7Var, a0Var2));
                        return;
                    }
                    org.telegram.messenger.g0.g3(new hi.c(15, r7Var, a0Var2));
                    return;
                }
                a0Var2 = a0Var;
                StringBuilder sb32 = new StringBuilder();
                sb32.append("captions: ");
                if (a0Var2 == null) {
                }
                sb32.append(str);
                Log.d("Dictation", sb32.toString());
                org.telegram.messenger.g0.g3(new hi.c(15, r7Var, a0Var2));
                return;
            case 4:
                jb.m mVar = (jb.m) this.d;
                String str5 = (String) this.e;
                long j15 = this.b;
                long j16 = this.c;
                n2.s sVar = (n2.s) mVar.c;
                String str6 = l0.a;
                m2.d dVar2 = ((l2.a0) sVar).a.s;
                m2.a U2 = dVar2.U();
                dVar2.V(U2, 1008, new li.c(U2, str5, j16, j15, 8));
                return;
            case 5:
                ((GroupCallMessagesController) this.d).lambda$processUpdate$3(this.b, this.c, (byte[]) this.e);
                return;
            case 6:
                ((oo) this.d).e(this.b, this.c, (HashSet) this.e);
                return;
            case 7:
                bx bxVar = (bx) this.d;
                long j17 = this.b;
                long j18 = this.c;
                w91 w91Var = (w91) this.e;
                if (bxVar.E2 == null) {
                    bxVar.finishFragment();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(sr.a(j17, j18));
                bxVar.E2.z(bxVar, arrayList, null, false, bxVar.L2, bxVar.M2, bxVar.N2, w91Var);
                if (bxVar.k2) {
                    bxVar.E2 = null;
                    return;
                }
                return;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j19 = this.b;
                long j20 = this.c;
                bn bnVar = (bn) this.e;
                String str7 = LaunchActivity.C1;
                TLRPC.TL_forumTopic f11 = mp.u1(launchActivity.P).t7.f(j19, j20);
                StringBuilder t10 = p0.t(j19, "LaunchActivity openForum after load ", " ");
                t10.append(j20);
                t10.append(" TL_forumTopic ");
                t10.append(f11);
                a8.b(t10.toString());
                if (launchActivity.p0 != null) {
                    qg.c.a(bnVar, sr.a(-j19, j20));
                    ((ActionBarLayout) launchActivity.M()).S(bnVar);
                    return;
                }
                return;
            default:
                u0 u0Var = (u0) this.d;
                q0 q0Var = (q0) this.e;
                long j21 = this.b;
                long j22 = this.c;
                synchronized (u0Var.g) {
                    if (!q0Var.d && !q0Var.e) {
                        ((ry0) u0Var.e).a(q0Var.a, q0Var.b, j21, j22);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ e0(Object obj, long j3, long j10, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.c = j10;
        this.e = obj2;
    }

    public /* synthetic */ e0(Object obj, Object obj2, long j3, long j10, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = j3;
        this.c = j10;
    }
}

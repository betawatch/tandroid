package e1;

import ag.r0;
import ai.i;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b2.e1;
import b2.f;
import b2.u0;
import b2.u1;
import b2.z0;
import bi.ad;
import bi.cd;
import c3.g;
import c3.u;
import com.google.android.gms.tasks.OnSuccessListener;
import e2.n0;
import e2.o;
import e2.x;
import ei.r;
import f2.w;
import f9.g1;
import f9.l1;
import fi.gb;
import fi.ia;
import fi.ib;
import fi.k3;
import fi.ka;
import fi.ma;
import fi.n1;
import fi.o3;
import fi.o9;
import fi.s6;
import fi.s9;
import fi.sb;
import fi.t5;
import fi.ta;
import fi.w6;
import hi.b5;
import hi.k;
import hi.m;
import hi.q;
import i2.d0;
import j4.c0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import n4.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vs0;
import rg.s1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, Utilities.Callback2Return, cm0, g1, b2, pl0, Utilities.Callback5, s1, CameraController.VideoTakeCallback, kw0, g, o, w {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(j2.a aVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // rg.s1
    public void a() {
        ta taVar = (ta) this.b;
        TextView textView = taVar.d1;
        boolean a2 = taVar.s0.a();
        ImageView imageView = taVar.c1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // org.telegram.ui.Components.kw0
    public /* synthetic */ float b(RecyclerView recyclerView) {
        return b10.c(recyclerView);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    @Override // org.telegram.ui.Components.cm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(int i10, View view) {
        MediaController.PhotoEntry photoEntry;
        switch (this.a) {
            case 2:
                vs0 vs0Var = ((r) this.b).W;
                if (!vs0Var.G.E1 && (view instanceof w7)) {
                    MessageObject messageObject = ((w7) view).getMessageObject();
                    if (!vs0Var.c(messageObject)) {
                        vs0Var.e(messageObject);
                        break;
                    } else {
                        vs0Var.g(messageObject);
                        break;
                    }
                }
                break;
            default:
                o3 o3Var = (o3) this.b;
                ArrayList arrayList = o3Var.b0;
                ArrayList arrayList2 = o3Var.h0;
                if (i10 >= 2 && o3Var.W != null && (view instanceof k3)) {
                    int i11 = i10 - 2;
                    if (!o3Var.c0) {
                        if (o3Var.d0) {
                            if (i11 < 0 || i11 >= arrayList.size()) {
                                i11 -= arrayList.size();
                            }
                        }
                        if (i11 >= 0) {
                            photoEntry = (MediaController.PhotoEntry) o3Var.f0.get(i11);
                            if (arrayList2.isEmpty()) {
                                if (!arrayList2.contains(photoEntry)) {
                                }
                                AndroidUtilities.updateVisibleRows(o3Var.d);
                                o3Var.j();
                            }
                        }
                    } else if (i11 != 0) {
                        i11 = i10 - 3;
                        if (i11 >= 0 && i11 < o3Var.f0.size()) {
                            photoEntry = (MediaController.PhotoEntry) o3Var.f0.get(i11);
                            if (arrayList2.isEmpty() && !o3Var.Q) {
                                if (!arrayList2.contains(photoEntry)) {
                                    arrayList2.remove(photoEntry);
                                } else if (arrayList2.size() + 1 > o3Var.R) {
                                    int i12 = -o3Var.N;
                                    o3Var.N = i12;
                                    AndroidUtilities.shakeViewSpring(view, i12);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    break;
                                } else {
                                    arrayList2.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(o3Var.d);
                                o3Var.j();
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pl0
    public void d() {
        ((n1) this.b).invalidate();
    }

    @Override // f2.w
    public void e(long j10, x xVar) {
        switch (this.a) {
            case 28:
                c3.b.c(j10, xVar, ((c0) this.b).c);
                break;
            default:
                c3.b.d(j10, xVar, ((c0) this.b).c);
                break;
        }
    }

    @Override // c3.g
    public long g(long j10) {
        return n0.j((j10 * r0.e) / 1000000, 0L, ((u) this.b).j - 1);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        switch (this.a) {
            case 5:
                sb sbVar = ((ib) ((fi.r) this.b)).S1;
                gb gbVar = sbVar.X0;
                if (gbVar != null) {
                    gbVar.s(null, null, true);
                }
                ta taVar = sbVar.v1;
                if (taVar != null) {
                    taVar.n0();
                }
                ib ibVar = sbVar.c1;
                if (ibVar != null) {
                    ibVar.setHasRoundVideo(false);
                }
                fi.w7 w7Var = sbVar.K1;
                if (w7Var != null) {
                    File file = w7Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        sbVar.K1.o0 = null;
                    }
                    if (sbVar.K1.p0 != null) {
                        try {
                            new File(sbVar.K1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        sbVar.K1.p0 = null;
                        break;
                    }
                }
                break;
            case 10:
                ((t5) this.b).a.e2.r();
                break;
            case 14:
                ((hi.d) this.b).run();
                break;
            default:
                k kVar = (k) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = kVar.getMessagesController().getInputUser(kVar.R);
                updatestarrefprogram.commission_permille = 0;
                e2 e2Var2 = new e2(kVar.getParentActivity(), 3, null);
                e2Var2.r(150L);
                kVar.getConnectionsManager().sendRequest(updatestarrefprogram, new hi.b(kVar, e2Var2, 0));
                break;
        }
    }

    @Override // org.telegram.ui.Components.kw0
    public RecyclerView i(View view) {
        ((cd) this.b).getClass();
        return ((ad) view).a;
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 18:
                ((e1) obj).onAudioAttributesChanged((f) this.b);
                break;
            case 19:
                ((e1) obj).onTrackSelectionParametersChanged((u1) this.b);
                break;
            case 20:
                ((e1) obj).onCues((d2.c) this.b);
                break;
            case 21:
                ((e1) obj).onMediaMetadataChanged(((d0) this.b).a.Q);
                break;
            case 22:
                ((e1) obj).onMetadata((u0) this.b);
                break;
            case 23:
            default:
                ((j2.b) obj).b((u2.c0) this.b);
                break;
            case 24:
                ((j2.b) obj).h((z0) this.b);
                break;
            case 25:
                ((j2.b) obj).onSeekStarted((j2.a) this.b);
                break;
            case 26:
                ((j2.b) obj).a((i2.e) this.b);
                break;
        }
    }

    @Override // f9.g1
    public Object l(Object obj, Object obj2) {
        return f9.o.x((List) ((Collection) obj2), new s(17, ((l1) this.b).f, obj));
    }

    @Override // org.telegram.ui.Components.kw0
    public /* synthetic */ void n(RecyclerView recyclerView) {
        b10.b(recyclerView);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        ma maVar = (ma) this.b;
        sb sbVar = maVar.a;
        w6 w6Var = sbVar.O0;
        int i10 = sbVar.c;
        if (w6Var != null) {
            w6Var.g(true);
        }
        if (sbVar.p0()) {
            sbVar.s.d();
        }
        if (sbVar.G1 == null || sbVar.B0 == null) {
            return;
        }
        sbVar.Q1 = false;
        sbVar.R1 = false;
        s6 s6Var = sbVar.C0;
        if (s6Var != null) {
            s6Var.c(false);
        }
        if (j10 <= 800) {
            sbVar.g(false, true);
            sbVar.c0(false);
            sbVar.J0.b(false, true);
            w6 w6Var2 = sbVar.O0;
            if (w6Var2 != null) {
                w6Var2.g(true);
            }
            try {
                sbVar.G1.delete();
                sbVar.G1 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            }
            return;
        }
        sbVar.h0(false, true);
        fi.w7 o10 = fi.w7.o(sbVar.G1, str, j10);
        o10.J0 = sbVar.v0;
        o10.K0 = sbVar.w0;
        o10.B();
        sbVar.g(false, true);
        sbVar.c0(false);
        sbVar.J0.b(false, true);
        w6 w6Var3 = sbVar.O0;
        if (w6Var3 != null) {
            w6Var3.g(true);
        }
        if (!sbVar.A0.j()) {
            sbVar.K1 = o10;
            o9.a(i10, o10);
            sbVar.L1 = false;
            int videoWidth = sbVar.B0.getVideoWidth();
            int videoHeight = sbVar.B0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                fi.w7 w7Var = sbVar.K1;
                w7Var.k0 = videoWidth;
                w7Var.l0 = videoHeight;
                w7Var.A();
            }
            sbVar.K(new ka(maVar, 3), 0L);
            return;
        }
        sbVar.G1 = null;
        o10.P = 1.0f;
        if (sbVar.A0.l(o10)) {
            fi.w7 a2 = fi.w7.a(sbVar.A0.getLayout(), sbVar.A0.getContent());
            sbVar.K1 = a2;
            o9.a(i10, a2);
            sbVar.L1 = false;
            int videoWidth2 = sbVar.B0.getVideoWidth();
            int videoHeight2 = sbVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                fi.w7 w7Var2 = sbVar.K1;
                w7Var2.k0 = videoWidth2;
                w7Var2.l0 = videoHeight2;
                w7Var2.A();
            }
        }
        sbVar.l0(true);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                ((b) this.b).invoke(obj);
                break;
            default:
                ((b) this.b).invoke(obj);
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = 1;
        switch (this.a) {
            case 8:
                ia iaVar = (ia) this.b;
                u61 u61Var = (u61) obj;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i11 = u61Var.d;
                fi.w7 w7Var = (fi.w7) u61Var.G;
                iaVar.c(false, true);
                sb sbVar = iaVar.O;
                if (w7Var != sbVar.K1 && !sbVar.X1) {
                    sbVar.d1.setSelected(i11);
                    sbVar.X1 = true;
                    r0 r0Var = new r0(sbVar, i11, 10);
                    ta taVar = sbVar.v1;
                    fi.w7 w7Var2 = sbVar.K1;
                    if (taVar != null && w7Var2 != null) {
                        if (!taVar.r0()) {
                            r0Var.run();
                            break;
                        } else {
                            w7Var2.f();
                            boolean r02 = taVar.r0();
                            Utilities.searchQueue.postRunnable(new s9(sbVar, taVar, w7Var2.i0, w7Var2.j0, w7Var2, taVar.D0.getPainting().E, r02, r0Var, 0));
                            break;
                        }
                    } else {
                        r0Var.run();
                        break;
                    }
                }
                break;
            case 16:
                q qVar = (q) this.b;
                u61 u61Var2 = (u61) obj;
                if (!qVar.q0 && u61Var2.d == 1) {
                    Object obj6 = u61Var2.G;
                    if (obj6 instanceof TL_agent.agentProvider) {
                        TL_agent.agentProvider agentprovider = (TL_agent.agentProvider) obj6;
                        qVar.p0 = agentprovider;
                        qVar.l0.setText("");
                        qVar.U(false);
                        qVar.o0.i(LocaleController.formatString(R.string.AgentConnectProvider, agentprovider.title), false, true);
                        qVar.V();
                        qVar.g0.g3.O(false);
                        qVar.e0.b(1, true);
                        AndroidUtilities.runOnUIThread(new m(qVar, i10), 250L);
                        break;
                    }
                }
                break;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((b5) this.b).W((u61) obj);
                break;
        }
    }

    public /* synthetic */ c(j2.a aVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        this.a = 27;
        this.b = c0Var;
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        vs0 vs0Var = (vs0) this.b;
        if (((Integer) obj).intValue() == -1) {
            new ei.u(vs0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new i(vs0Var, 14)).show();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}

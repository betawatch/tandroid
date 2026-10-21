package ci;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.rd;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ab0;
import org.telegram.ui.au0;
import org.telegram.ui.cg0;
import org.telegram.ui.dg0;
import org.telegram.ui.jq0;
import org.telegram.ui.ju0;
import org.telegram.ui.nq0;
import org.telegram.ui.ns0;
import org.telegram.ui.oq0;
import org.telegram.ui.ot0;
import org.telegram.ui.qa1;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h2(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mf mfVar;
        switch (this.a) {
            case 0:
                q4 q4Var = (q4) this.c;
                boolean z10 = this.b;
                MessagesController.getInstance(q4Var.C2).setStoryQuality(!z10);
                new xc(q4Var.c1, q4Var.B0).M(LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).j();
                h4 h4Var = q4Var.t1;
                if (h4Var != null) {
                    h4Var.a();
                    break;
                }
                break;
            case 1:
                h4 h4Var2 = (h4) this.c;
                boolean z11 = this.b;
                h1 h1Var = h1.W;
                if (h1Var != null) {
                    boolean z12 = !z11;
                    if (h1Var.n && h1Var.r != z12) {
                        h1Var.r = z12;
                        NativeInstance nativeInstance = h1Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                }
                h4 h4Var3 = h4Var2.l.t1;
                if (h4Var3 != null) {
                    h4Var3.a();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.c;
                boolean z13 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
                if (m1Var != null && m1Var.isShowing() && z13) {
                    if (!u0Var.T) {
                        u0Var.T = true;
                        u0Var.d.d(u0Var.R);
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var.c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    org.telegram.ui.ActionBar.q0 q0Var = u0Var.P;
                    if (q0Var != null) {
                        q0Var.j(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                qa1 qa1Var = (qa1) this.c;
                boolean z14 = this.b;
                for (int i10 = 0; i10 < 2; i10++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) qa1Var.b)[i10];
                    y0Var.a.a(y0Var == view, true);
                }
                SharedConfig.setUseThreeLinesLayout(z14);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                boolean z15 = this.b;
                rd rdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView.Q0();
                if (!z15 && (mfVar = chatActivityEnterView.L0) != null) {
                    mfVar.g(!Q0);
                    chatActivityEnterView.L0 = null;
                    break;
                } else {
                    chatActivityEnterView.E4 = !Q0;
                    AndroidUtilities.cancelRunOnUIThread(rdVar);
                    AndroidUtilities.runOnUIThread(rdVar, 500L);
                    break;
                }
            case 5:
                ti tiVar = (ti) this.c;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = tiVar.f0;
                if (tiVar.T0 != 0) {
                    tiVar.c2.E();
                    tiVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    oq0 oq0Var = new oq0(hashMap, arrayList, 0, true, (qn) n2Var);
                    th thVar = new th(tiVar, hashMap, arrayList);
                    jq0 jq0Var = oq0Var.a;
                    jq0Var.s0 = thVar;
                    jq0 jq0Var2 = oq0Var.b;
                    jq0Var2.s0 = thVar;
                    jq0Var.t0 = new nq0(oq0Var, 0);
                    jq0Var2.t0 = new nq0(oq0Var, 1);
                    int i11 = tiVar.V1;
                    boolean z17 = tiVar.W1;
                    jq0Var.f0(i11, z17);
                    oq0Var.b.f0(i11, z17);
                    if (z16) {
                        n2Var.showAsSheet(oq0Var);
                    } else {
                        n2Var.presentFragment(oq0Var);
                    }
                    tiVar.dismiss();
                    break;
                }
            case 6:
                ah0 ah0Var = (ah0) this.c;
                boolean z18 = this.b;
                ah0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z19 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z18 && (!z19 || !LaunchActivity.F1)) {
                    LaunchActivity.G1 = new uu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    cv cvVar = ah0Var.U;
                    if (cvVar != null) {
                        cvVar.I();
                        break;
                    } else {
                        PhotoViewer photoViewer = ah0Var.V;
                        if (photoViewer != null && photoViewer.J3) {
                            if (PhotoViewer.a9 != null) {
                                PhotoViewer.a9.H0(false, true);
                            }
                            ot0 ot0Var = photoViewer.f0;
                            if (ot0Var != null && ot0Var.f != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        ot0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                    }
                                }
                                ot0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) ot0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(ot0Var.f);
                                }
                                ot0Var.addView(ot0Var.f, 0, w7.z5.e(-1, -1, 51));
                                ah0.j(false);
                            }
                            PhotoViewer.a9 = PhotoViewer.b9;
                            PhotoViewer.b9 = null;
                            if (photoViewer.f0 == null) {
                                photoViewer.L3 = true;
                                Bitmap bitmap = photoViewer.C3;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    photoViewer.C3 = null;
                                }
                                photoViewer.F3 = true;
                            }
                            photoViewer.J3 = false;
                            View view2 = photoViewer.D2 ? photoViewer.C2 : photoViewer.B2;
                            if (photoViewer.f0 == null && view2 != null) {
                                AndroidUtilities.removeFromParent(view2);
                                view2.setVisibility(4);
                                photoViewer.y2.addView(view2);
                            }
                            if (ApplicationLoader.mainInterfacePaused) {
                                try {
                                    photoViewer.y.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                }
                            }
                            if (photoViewer.f0 != null) {
                                photoViewer.m6 = 0.0f;
                            } else if (view2 != null) {
                                photoViewer.B3 = true;
                                fl0 o10 = ah0.o(photoViewer.y2.getAspectRatio(), false);
                                float f7 = o10.c / photoViewer.x3.getLayoutParams().width;
                                photoViewer.x3.setScaleX(f7);
                                photoViewer.x3.setScaleY(f7);
                                photoViewer.x3.setTranslationX(o10.a);
                                photoViewer.x3.setTranslationY(o10.b);
                                view2.setScaleX(f7);
                                view2.setScaleY(f7);
                                view2.setTranslationX(o10.a - photoViewer.y2.getX());
                                view2.setTranslationY(o10.b - photoViewer.y2.getY());
                                au0 au0Var = photoViewer.E2;
                                if (au0Var != null) {
                                    au0Var.setScaleX(f7);
                                    photoViewer.E2.setScaleY(f7);
                                    photoViewer.E2.setTranslationX(view2.getTranslationX());
                                    photoViewer.E2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.W = 0.0f;
                                ns0 ns0Var = new ns0(photoViewer, f7, 1);
                                view2.setOutlineProvider(ns0Var);
                                view2.setClipToOutline(true);
                                photoViewer.x3.setOutlineProvider(ns0Var);
                                photoViewer.x3.setClipToOutline(true);
                                au0 au0Var2 = photoViewer.E2;
                                if (au0Var2 != null) {
                                    au0Var2.setOutlineProvider(ns0Var);
                                    photoViewer.E2.setClipToOutline(true);
                                }
                            } else {
                                ah0.j(true);
                            }
                            try {
                                photoViewer.e = true;
                                photoViewer.f = true;
                                ((WindowManager) photoViewer.y.getSystemService("window")).addView(photoViewer.g0, photoViewer.d0);
                                Activity activity = photoViewer.y;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).a1.add(photoViewer.s1);
                                }
                                ju0 ju0Var = photoViewer.d5;
                                if (ju0Var != null && !ju0Var.s) {
                                    ju0Var.a.setVisible(false, false);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            if (photoViewer.D2) {
                                i2.i0 i0Var = photoViewer.F2.d;
                                if (i0Var != null) {
                                    i0Var.z1(null);
                                }
                                photoViewer.F2.U(photoViewer.C2);
                                photoViewer.C2.setVisibility(4);
                                photoViewer.G3 = 2;
                                photoViewer.F3 = false;
                                photoViewer.e0.invalidate();
                                photoViewer.v3 = 4;
                                break;
                            } else {
                                photoViewer.v3 = 4;
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                ab0 ab0Var = (ab0) this.c;
                if (!this.b) {
                    org.telegram.ui.Cells.v8 v8Var = ab0Var.n;
                    if (v8Var == null || !v8Var.e.h) {
                        org.telegram.ui.Cells.v8 v8Var2 = (org.telegram.ui.Cells.v8) view;
                        boolean z20 = v8Var2.e.h;
                        v8Var2.setChecked(!z20);
                        ab0Var.Z(z20);
                        org.telegram.ui.Cells.v8 v8Var3 = ab0Var.n;
                        if (v8Var3 != null) {
                            if (v8Var2.e.h) {
                                v8Var3.setChecked(false);
                                ab0Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                ab0Var.r.setVisibility(8);
                                break;
                            } else if (ab0Var.e == null) {
                                v8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i12 = -ab0Var.N;
                        ab0Var.N = i12;
                        AndroidUtilities.shakeViewSpring(v8Var, i12);
                        break;
                    }
                }
                break;
            default:
                cg0 cg0Var = (cg0) this.c;
                boolean z21 = this.b;
                dg0 dg0Var = cg0Var.V;
                if (dg0Var.getParentActivity() != null) {
                    boolean z22 = !dg0Var.E;
                    dg0Var.E = z22;
                    ((org.telegram.ui.Cells.a2) view).c(z22, true);
                    if ((z21 && dg0Var.getConnectionsManager().isTestBackend()) != dg0Var.E) {
                        dg0Var.getConnectionsManager().switchBackend(false);
                    }
                    cg0Var.r();
                    break;
                }
                break;
        }
    }
}

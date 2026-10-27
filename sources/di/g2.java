package di;

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
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.sd;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fb0;
import org.telegram.ui.hg0;
import org.telegram.ui.ig0;
import org.telegram.ui.ju0;
import org.telegram.ui.su0;
import org.telegram.ui.tq0;
import org.telegram.ui.wn;
import org.telegram.ui.wq0;
import org.telegram.ui.ws0;
import org.telegram.ui.xq0;
import org.telegram.ui.xt0;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g2(int i10, Object obj, boolean z10) {
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
                MessagesController.getInstance(q4Var.r2).setStoryQuality(!z10);
                new wc(q4Var.R0, q4Var.q0).M(LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).j();
                h4 h4Var = q4Var.i1;
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
                h4 h4Var3 = h4Var2.l.i1;
                if (h4Var3 != null) {
                    h4Var3.a();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.c;
                boolean z13 = this.b;
                if (w0Var.x() && z13) {
                    if (!w0Var.T) {
                        w0Var.T = true;
                        w0Var.q();
                    }
                }
                org.telegram.ui.ActionBar.z zVar = w0Var.c;
                if (zVar != null) {
                    zVar.n(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    org.telegram.ui.ActionBar.r0 r0Var = w0Var.P;
                    if (r0Var != null) {
                        r0Var.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                za1 za1Var = (za1) this.c;
                boolean z14 = this.b;
                for (int i10 = 0; i10 < 2; i10++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) za1Var.b)[i10];
                    x0Var.a.a(x0Var == view, true);
                }
                SharedConfig.setUseThreeLinesLayout(z14);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                boolean z15 = this.b;
                sd sdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean P0 = chatActivityEnterView.P0();
                if (!z15 && (mfVar = chatActivityEnterView.L0) != null) {
                    mfVar.g(!P0);
                    chatActivityEnterView.L0 = null;
                    break;
                } else {
                    chatActivityEnterView.E4 = !P0;
                    AndroidUtilities.cancelRunOnUIThread(sdVar);
                    AndroidUtilities.runOnUIThread(sdVar, 500L);
                    break;
                }
            case 5:
                ti tiVar = (ti) this.c;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
                if (tiVar.T0 != 0) {
                    tiVar.c2.H();
                    tiVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    xq0 xq0Var = new xq0(hashMap, arrayList, 0, true, (wn) r2Var);
                    ii iiVar = new ii(tiVar, hashMap, arrayList);
                    tq0 tq0Var = xq0Var.a;
                    tq0Var.s0 = iiVar;
                    tq0 tq0Var2 = xq0Var.b;
                    tq0Var2.s0 = iiVar;
                    tq0Var.t0 = new wq0(xq0Var, 0);
                    tq0Var2.t0 = new wq0(xq0Var, 1);
                    int i11 = tiVar.V1;
                    boolean z17 = tiVar.W1;
                    tq0Var.g0(i11, z17);
                    xq0Var.b.g0(i11, z17);
                    if (z16) {
                        r2Var.showAsSheet(xq0Var);
                    } else {
                        r2Var.presentFragment(xq0Var);
                    }
                    tiVar.dismiss();
                    break;
                }
            case 6:
                dh0 dh0Var = (dh0) this.c;
                boolean z18 = this.b;
                dh0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z19 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z18 && (!z19 || !LaunchActivity.G1)) {
                    LaunchActivity.H1 = new vu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    dv dvVar = dh0Var.U;
                    if (dvVar != null) {
                        dvVar.H();
                        break;
                    } else {
                        PhotoViewer photoViewer = dh0Var.V;
                        if (photoViewer != null && photoViewer.J3) {
                            if (PhotoViewer.a9 != null) {
                                PhotoViewer.a9.H0(false, true);
                            }
                            xt0 xt0Var = photoViewer.f0;
                            if (xt0Var != null && xt0Var.f != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        xt0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                    }
                                }
                                xt0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) xt0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(xt0Var.f);
                                }
                                xt0Var.addView(xt0Var.f, 0, kb1.i(-1, -1, 51));
                                dh0.j(false);
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
                                il0 o10 = dh0.o(photoViewer.y2.getAspectRatio(), false);
                                float f7 = o10.c / photoViewer.x3.getLayoutParams().width;
                                photoViewer.x3.setScaleX(f7);
                                photoViewer.x3.setScaleY(f7);
                                photoViewer.x3.setTranslationX(o10.a);
                                photoViewer.x3.setTranslationY(o10.b);
                                view2.setScaleX(f7);
                                view2.setScaleY(f7);
                                view2.setTranslationX(o10.a - photoViewer.y2.getX());
                                view2.setTranslationY(o10.b - photoViewer.y2.getY());
                                ju0 ju0Var = photoViewer.E2;
                                if (ju0Var != null) {
                                    ju0Var.setScaleX(f7);
                                    photoViewer.E2.setScaleY(f7);
                                    photoViewer.E2.setTranslationX(view2.getTranslationX());
                                    photoViewer.E2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.W = 0.0f;
                                ws0 ws0Var = new ws0(photoViewer, f7, 1);
                                view2.setOutlineProvider(ws0Var);
                                view2.setClipToOutline(true);
                                photoViewer.x3.setOutlineProvider(ws0Var);
                                photoViewer.x3.setClipToOutline(true);
                                ju0 ju0Var2 = photoViewer.E2;
                                if (ju0Var2 != null) {
                                    ju0Var2.setOutlineProvider(ws0Var);
                                    photoViewer.E2.setClipToOutline(true);
                                }
                            } else {
                                dh0.j(true);
                            }
                            try {
                                photoViewer.e = true;
                                photoViewer.f = true;
                                ((WindowManager) photoViewer.y.getSystemService("window")).addView(photoViewer.g0, photoViewer.d0);
                                Activity activity = photoViewer.y;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).b1.add(photoViewer.s1);
                                }
                                su0 su0Var = photoViewer.d5;
                                if (su0Var != null && !su0Var.s) {
                                    su0Var.a.setVisible(false, false);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            if (photoViewer.D2) {
                                i2.j0 j0Var = photoViewer.F2.d;
                                if (j0Var != null) {
                                    j0Var.z1(null);
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
                fb0 fb0Var = (fb0) this.c;
                if (!this.b) {
                    org.telegram.ui.Cells.a9 a9Var = fb0Var.n;
                    if (a9Var == null || !a9Var.e.h) {
                        org.telegram.ui.Cells.a9 a9Var2 = (org.telegram.ui.Cells.a9) view;
                        boolean z20 = a9Var2.e.h;
                        a9Var2.setChecked(!z20);
                        fb0Var.a0(z20);
                        org.telegram.ui.Cells.a9 a9Var3 = fb0Var.n;
                        if (a9Var3 != null) {
                            if (a9Var2.e.h) {
                                a9Var3.setChecked(false);
                                fb0Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                fb0Var.r.setVisibility(8);
                                break;
                            } else if (fb0Var.e == null) {
                                a9Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i12 = -fb0Var.M;
                        fb0Var.M = i12;
                        AndroidUtilities.shakeViewSpring(a9Var, i12);
                        break;
                    }
                }
                break;
            default:
                hg0 hg0Var = (hg0) this.c;
                boolean z21 = this.b;
                ig0 ig0Var = hg0Var.a0;
                if (ig0Var.getParentActivity() != null) {
                    boolean z22 = !ig0Var.E;
                    ig0Var.E = z22;
                    ((org.telegram.ui.Cells.y1) view).c(z22, true);
                    if ((z21 && ig0Var.getConnectionsManager().isTestBackend()) != ig0Var.E) {
                        ig0Var.getConnectionsManager().switchBackend(false);
                    }
                    hg0Var.q();
                    break;
                }
                break;
        }
    }
}

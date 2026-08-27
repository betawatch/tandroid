package jh;

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
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.ye;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.aq0;
import org.telegram.ui.cu0;
import org.telegram.ui.eq0;
import org.telegram.ui.fb0;
import org.telegram.ui.fq0;
import org.telegram.ui.fs0;
import org.telegram.ui.hg0;
import org.telegram.ui.ht0;
import org.telegram.ui.ig0;
import org.telegram.ui.ra1;
import org.telegram.ui.rn;
import org.telegram.ui.tt0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a2(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ye yeVar;
        switch (this.a) {
            case 0:
                e4 e4Var = (e4) this.c;
                boolean z10 = this.b;
                MessagesController.getInstance(e4Var.y2).setStoryQuality(!z10);
                new mc(e4Var.Y0, e4Var.x0).M(LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).j();
                x3 x3Var = e4Var.p1;
                if (x3Var != null) {
                    x3Var.a();
                    break;
                }
                break;
            case 1:
                x3 x3Var2 = (x3) this.c;
                boolean z11 = this.b;
                d1 d1Var = d1.S;
                if (d1Var != null) {
                    boolean z12 = !z11;
                    if (d1Var.n && d1Var.r != z12) {
                        d1Var.r = z12;
                        NativeInstance nativeInstance = d1Var.A;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                }
                x3 x3Var3 = x3Var2.l.p1;
                if (x3Var3 != null) {
                    x3Var3.a();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.c;
                boolean z13 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
                if (n1Var != null && n1Var.isShowing() && z13) {
                    if (!v0Var.P) {
                        v0Var.P = true;
                        v0Var.d.d(v0Var.N);
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var.c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    org.telegram.ui.ActionBar.r0 r0Var = v0Var.L;
                    if (r0Var != null) {
                        r0Var.h(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                ra1 ra1Var = (ra1) this.c;
                boolean z14 = this.b;
                for (int i10 = 0; i10 < 2; i10++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) ra1Var.b)[i10];
                    x0Var.a.a(x0Var == view, true);
                }
                SharedConfig.setUseThreeLinesLayout(z14);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                boolean z15 = this.b;
                ed edVar = chatActivityEnterView.A4;
                chatActivityEnterView.I0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z15 && (yeVar = chatActivityEnterView.H0) != null) {
                    yeVar.h(!S0);
                    chatActivityEnterView.H0 = null;
                    break;
                } else {
                    chatActivityEnterView.z4 = !S0;
                    AndroidUtilities.cancelRunOnUIThread(edVar);
                    AndroidUtilities.runOnUIThread(edVar, 500L);
                    break;
                }
            case 5:
                gi giVar = (gi) this.c;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = giVar.b0;
                if (giVar.M0 != 0) {
                    giVar.V1.w();
                    giVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    fq0 fq0Var = new fq0(hashMap, arrayList, 0, true, (rn) n2Var);
                    fh fhVar = new fh(giVar, hashMap, arrayList);
                    aq0 aq0Var = fq0Var.a;
                    aq0Var.o0 = fhVar;
                    aq0 aq0Var2 = fq0Var.b;
                    aq0Var2.o0 = fhVar;
                    aq0Var.p0 = new eq0(fq0Var, 0);
                    aq0Var2.p0 = new eq0(fq0Var, 1);
                    int i11 = giVar.O1;
                    boolean z17 = giVar.P1;
                    aq0Var.f0(i11, z17);
                    fq0Var.b.f0(i11, z17);
                    if (z16) {
                        n2Var.showAsSheet(fq0Var);
                    } else {
                        n2Var.presentFragment(fq0Var);
                    }
                    giVar.dismiss();
                    break;
                }
            case 6:
                sf0 sf0Var = (sf0) this.c;
                boolean z18 = this.b;
                sf0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z19 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z18 && (!z19 || !LaunchActivity.A1)) {
                    LaunchActivity.B1 = new xt(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    fu fuVar = sf0Var.Q;
                    if (fuVar != null) {
                        fuVar.I();
                        break;
                    } else {
                        PhotoViewer photoViewer = sf0Var.R;
                        if (photoViewer != null && photoViewer.F3) {
                            if (PhotoViewer.V8 != null) {
                                PhotoViewer.V8.G0(false, true);
                            }
                            ht0 ht0Var = photoViewer.b0;
                            if (ht0Var != null && ht0Var.f != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        ht0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th) {
                                        FileLog.e(th);
                                    }
                                }
                                ht0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) ht0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(ht0Var.f);
                                }
                                ht0Var.addView(ht0Var.f, 0, h7.z5.e(-1, -1, 51));
                                sf0.j(false);
                            }
                            PhotoViewer.V8 = PhotoViewer.W8;
                            PhotoViewer.W8 = null;
                            if (photoViewer.b0 == null) {
                                photoViewer.H3 = true;
                                Bitmap bitmap = photoViewer.y3;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    photoViewer.y3 = null;
                                }
                                photoViewer.B3 = true;
                            }
                            photoViewer.F3 = false;
                            View view2 = photoViewer.z2 ? photoViewer.y2 : photoViewer.x2;
                            if (photoViewer.b0 == null && view2 != null) {
                                AndroidUtilities.removeFromParent(view2);
                                view2.setVisibility(4);
                                photoViewer.u2.addView(view2);
                            }
                            if (ApplicationLoader.mainInterfacePaused) {
                                try {
                                    photoViewer.y.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                } catch (Throwable th2) {
                                    FileLog.e(th2);
                                }
                            }
                            if (photoViewer.b0 != null) {
                                photoViewer.i6 = 0.0f;
                            } else if (view2 != null) {
                                photoViewer.x3 = true;
                                yj0 o10 = sf0.o(photoViewer.u2.getAspectRatio(), false);
                                float f10 = o10.c / photoViewer.t3.getLayoutParams().width;
                                photoViewer.t3.setScaleX(f10);
                                photoViewer.t3.setScaleY(f10);
                                photoViewer.t3.setTranslationX(o10.a);
                                photoViewer.t3.setTranslationY(o10.b);
                                view2.setScaleX(f10);
                                view2.setScaleY(f10);
                                view2.setTranslationX(o10.a - photoViewer.u2.getX());
                                view2.setTranslationY(o10.b - photoViewer.u2.getY());
                                tt0 tt0Var = photoViewer.A2;
                                if (tt0Var != null) {
                                    tt0Var.setScaleX(f10);
                                    photoViewer.A2.setScaleY(f10);
                                    photoViewer.A2.setTranslationX(view2.getTranslationX());
                                    photoViewer.A2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.S = 0.0f;
                                fs0 fs0Var = new fs0(photoViewer, f10, 1);
                                view2.setOutlineProvider(fs0Var);
                                view2.setClipToOutline(true);
                                photoViewer.t3.setOutlineProvider(fs0Var);
                                photoViewer.t3.setClipToOutline(true);
                                tt0 tt0Var2 = photoViewer.A2;
                                if (tt0Var2 != null) {
                                    tt0Var2.setOutlineProvider(fs0Var);
                                    photoViewer.A2.setClipToOutline(true);
                                }
                            } else {
                                sf0.j(true);
                            }
                            try {
                                photoViewer.e = true;
                                photoViewer.f = true;
                                ((WindowManager) photoViewer.y.getSystemService("window")).addView(photoViewer.c0, photoViewer.Z);
                                Activity activity = photoViewer.y;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).W0.add(photoViewer.o1);
                                }
                                cu0 cu0Var = photoViewer.Z4;
                                if (cu0Var != null && !cu0Var.s) {
                                    cu0Var.a.setVisible(false, false);
                                }
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            if (photoViewer.z2) {
                                h3.k0 k0Var = photoViewer.B2.d;
                                if (k0Var != null) {
                                    k0Var.j0(null);
                                }
                                photoViewer.B2.V(photoViewer.y2);
                                photoViewer.y2.setVisibility(4);
                                photoViewer.C3 = 2;
                                photoViewer.B3 = false;
                                photoViewer.a0.invalidate();
                                photoViewer.r3 = 4;
                                break;
                            } else {
                                photoViewer.r3 = 4;
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                fb0 fb0Var = (fb0) this.c;
                if (!this.b) {
                    org.telegram.ui.Cells.p8 p8Var = fb0Var.n;
                    if (p8Var == null || !p8Var.e.h) {
                        org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) view;
                        boolean z20 = p8Var2.e.h;
                        p8Var2.setChecked(!z20);
                        fb0Var.Z(z20);
                        org.telegram.ui.Cells.p8 p8Var3 = fb0Var.n;
                        if (p8Var3 != null) {
                            if (p8Var2.e.h) {
                                p8Var3.setChecked(false);
                                fb0Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                fb0Var.r.setVisibility(8);
                                break;
                            } else if (fb0Var.e == null) {
                                p8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i12 = -fb0Var.J;
                        fb0Var.J = i12;
                        AndroidUtilities.shakeViewSpring(p8Var, i12);
                        break;
                    }
                }
                break;
            default:
                hg0 hg0Var = (hg0) this.c;
                boolean z21 = this.b;
                ig0 ig0Var = hg0Var.R;
                if (ig0Var.getParentActivity() != null) {
                    boolean z22 = !ig0Var.A;
                    ig0Var.A = z22;
                    ((org.telegram.ui.Cells.y1) view).c(z22, true);
                    if ((z21 && ig0Var.getConnectionsManager().isTestBackend()) != ig0Var.A) {
                        ig0Var.getConnectionsManager().switchBackend(false);
                    }
                    hg0Var.s();
                    break;
                }
                break;
        }
    }
}

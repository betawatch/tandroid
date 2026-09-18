package ai;

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
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.rd;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bc1;
import org.telegram.ui.cr0;
import org.telegram.ui.dv0;
import org.telegram.ui.gr0;
import org.telegram.ui.hr0;
import org.telegram.ui.ht0;
import org.telegram.ui.iu0;
import org.telegram.ui.uu0;
import org.telegram.ui.wg0;
import org.telegram.ui.xg0;
import org.telegram.ui.yb0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j3(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mf mfVar;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.c;
                boolean z10 = this.b;
                MessagesController.getInstance(f6Var.C2).setStoryQuality(!z10);
                new xc(f6Var.c1, f6Var.B0).M(LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).j();
                w5 w5Var = f6Var.t1;
                if (w5Var != null) {
                    w5Var.a();
                    break;
                }
                break;
            case 1:
                w5 w5Var2 = (w5) this.c;
                boolean z11 = this.b;
                d2 d2Var = d2.W;
                if (d2Var != null) {
                    boolean z12 = !z11;
                    if (d2Var.n && d2Var.r != z12) {
                        d2Var.r = z12;
                        NativeInstance nativeInstance = d2Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                }
                w5 w5Var3 = w5Var2.l.t1;
                if (w5Var3 != null) {
                    w5Var3.a();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.c;
                boolean z13 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
                if (n1Var != null && n1Var.isShowing() && z13) {
                    if (!v0Var.T) {
                        v0Var.T = true;
                        v0Var.d.d(v0Var.R);
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var.c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    org.telegram.ui.ActionBar.r0 r0Var = v0Var.P;
                    if (r0Var != null) {
                        r0Var.m(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                bc1 bc1Var = (bc1) this.c;
                boolean z14 = this.b;
                for (int i10 = 0; i10 < 2; i10++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) bc1Var.b)[i10];
                    y0Var.a.a(y0Var == view, true);
                }
                SharedConfig.setUseThreeLinesLayout(z14);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                boolean z15 = this.b;
                rd rdVar = chatActivityEnterView.E4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z15 && (mfVar = chatActivityEnterView.L0) != null) {
                    mfVar.h(!S0);
                    chatActivityEnterView.L0 = null;
                    break;
                } else {
                    chatActivityEnterView.D4 = !S0;
                    AndroidUtilities.cancelRunOnUIThread(rdVar);
                    AndroidUtilities.runOnUIThread(rdVar, 500L);
                    break;
                }
            case 5:
                vi viVar = (vi) this.c;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
                if (viVar.Q0 != 0) {
                    viVar.Z1.u0();
                    viVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    hr0 hr0Var = new hr0(hashMap, arrayList, 0, true, (zn) n2Var);
                    uh uhVar = new uh(viVar, hashMap, arrayList);
                    cr0 cr0Var = hr0Var.a;
                    cr0Var.s0 = uhVar;
                    cr0 cr0Var2 = hr0Var.b;
                    cr0Var2.s0 = uhVar;
                    cr0Var.t0 = new gr0(hr0Var, 0);
                    cr0Var2.t0 = new gr0(hr0Var, 1);
                    int i11 = viVar.S1;
                    boolean z17 = viVar.T1;
                    cr0Var.f0(i11, z17);
                    hr0Var.b.f0(i11, z17);
                    if (z16) {
                        n2Var.showAsSheet(hr0Var);
                    } else {
                        n2Var.presentFragment(hr0Var);
                    }
                    viVar.dismiss();
                    break;
                }
            case 6:
                pg0 pg0Var = (pg0) this.c;
                boolean z18 = this.b;
                pg0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z19 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z18 && (!z19 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new nu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    vu vuVar = pg0Var.U;
                    if (vuVar != null) {
                        vuVar.I();
                        break;
                    } else {
                        PhotoViewer photoViewer = pg0Var.V;
                        if (photoViewer != null && photoViewer.J3) {
                            if (PhotoViewer.a9 != null) {
                                PhotoViewer.a9.G0(false, true);
                            }
                            iu0 iu0Var = photoViewer.f0;
                            if (iu0Var != null && iu0Var.f != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        iu0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                    }
                                }
                                iu0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) iu0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(iu0Var.f);
                                }
                                iu0Var.addView(iu0Var.f, 0, w7.y5.e(-1, -1, 51));
                                pg0.j(false);
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
                                sk0 o9 = pg0.o(photoViewer.y2.getAspectRatio(), false);
                                float f7 = o9.c / photoViewer.x3.getLayoutParams().width;
                                photoViewer.x3.setScaleX(f7);
                                photoViewer.x3.setScaleY(f7);
                                photoViewer.x3.setTranslationX(o9.a);
                                photoViewer.x3.setTranslationY(o9.b);
                                view2.setScaleX(f7);
                                view2.setScaleY(f7);
                                view2.setTranslationX(o9.a - photoViewer.y2.getX());
                                view2.setTranslationY(o9.b - photoViewer.y2.getY());
                                uu0 uu0Var = photoViewer.E2;
                                if (uu0Var != null) {
                                    uu0Var.setScaleX(f7);
                                    photoViewer.E2.setScaleY(f7);
                                    photoViewer.E2.setTranslationX(view2.getTranslationX());
                                    photoViewer.E2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.W = 0.0f;
                                ht0 ht0Var = new ht0(photoViewer, f7, 1);
                                view2.setOutlineProvider(ht0Var);
                                view2.setClipToOutline(true);
                                photoViewer.x3.setOutlineProvider(ht0Var);
                                photoViewer.x3.setClipToOutline(true);
                                uu0 uu0Var2 = photoViewer.E2;
                                if (uu0Var2 != null) {
                                    uu0Var2.setOutlineProvider(ht0Var);
                                    photoViewer.E2.setClipToOutline(true);
                                }
                            } else {
                                pg0.j(true);
                            }
                            try {
                                photoViewer.e = true;
                                photoViewer.f = true;
                                ((WindowManager) photoViewer.y.getSystemService("window")).addView(photoViewer.g0, photoViewer.d0);
                                Activity activity = photoViewer.y;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).a1.add(photoViewer.s1);
                                }
                                dv0 dv0Var = photoViewer.d5;
                                if (dv0Var != null && !dv0Var.s) {
                                    dv0Var.a.setVisible(false, false);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            if (photoViewer.D2) {
                                i2.e0 e0Var = photoViewer.F2.d;
                                if (e0Var != null) {
                                    e0Var.v1(null);
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
                yb0 yb0Var = (yb0) this.c;
                if (!this.b) {
                    org.telegram.ui.Cells.w8 w8Var = yb0Var.n;
                    if (w8Var == null || !w8Var.e.h) {
                        org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                        boolean z20 = w8Var2.e.h;
                        w8Var2.setChecked(!z20);
                        yb0Var.Z(z20);
                        org.telegram.ui.Cells.w8 w8Var3 = yb0Var.n;
                        if (w8Var3 != null) {
                            if (w8Var2.e.h) {
                                w8Var3.setChecked(false);
                                yb0Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                yb0Var.r.setVisibility(8);
                                break;
                            } else if (yb0Var.e == null) {
                                w8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i12 = -yb0Var.N;
                        yb0Var.N = i12;
                        AndroidUtilities.shakeViewSpring(w8Var, i12);
                        break;
                    }
                }
                break;
            default:
                wg0 wg0Var = (wg0) this.c;
                boolean z21 = this.b;
                xg0 xg0Var = wg0Var.V;
                if (xg0Var.getParentActivity() != null) {
                    boolean z22 = !xg0Var.E;
                    xg0Var.E = z22;
                    ((org.telegram.ui.Cells.a2) view).c(z22, true);
                    if ((z21 && xg0Var.getConnectionsManager().isTestBackend()) != xg0Var.E) {
                        xg0Var.getConnectionsManager().switchBackend(false);
                    }
                    wg0Var.s();
                    break;
                }
                break;
        }
    }
}

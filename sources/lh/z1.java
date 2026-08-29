package lh;

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
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dq0;
import org.telegram.ui.ds0;
import org.telegram.ui.eb0;
import org.telegram.ui.eg0;
import org.telegram.ui.eq0;
import org.telegram.ui.et0;
import org.telegram.ui.fg0;
import org.telegram.ui.qt0;
import org.telegram.ui.tn;
import org.telegram.ui.ua1;
import org.telegram.ui.zp0;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z1(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ff ffVar;
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.c;
                boolean z10 = this.b;
                MessagesController.getInstance(d4Var.y2).setStoryQuality(!z10);
                new tc(d4Var.Y0, d4Var.x0).M(LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).j();
                w3 w3Var = d4Var.p1;
                if (w3Var != null) {
                    w3Var.a();
                    break;
                }
                break;
            case 1:
                w3 w3Var2 = (w3) this.c;
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
                w3 w3Var3 = w3Var2.l.p1;
                if (w3Var3 != null) {
                    w3Var3.a();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.c;
                boolean z13 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var = w0Var.d;
                if (o1Var != null && o1Var.isShowing() && z13) {
                    if (!w0Var.P) {
                        w0Var.P = true;
                        w0Var.d.d(w0Var.N);
                    }
                }
                org.telegram.ui.ActionBar.a0 a0Var = w0Var.c;
                if (a0Var != null) {
                    a0Var.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    org.telegram.ui.ActionBar.s0 s0Var = w0Var.L;
                    if (s0Var != null) {
                        s0Var.i(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                ua1 ua1Var = (ua1) this.c;
                boolean z14 = this.b;
                for (int i10 = 0; i10 < 2; i10++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) ua1Var.b)[i10];
                    x0Var.a.a(x0Var == view, true);
                }
                SharedConfig.setUseThreeLinesLayout(z14);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                boolean z15 = this.b;
                ld ldVar = chatActivityEnterView.A4;
                chatActivityEnterView.I0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z15 && (ffVar = chatActivityEnterView.H0) != null) {
                    ffVar.h(!S0);
                    chatActivityEnterView.H0 = null;
                    break;
                } else {
                    chatActivityEnterView.z4 = !S0;
                    AndroidUtilities.cancelRunOnUIThread(ldVar);
                    AndroidUtilities.runOnUIThread(ldVar, 500L);
                    break;
                }
            case 5:
                ni niVar = (ni) this.c;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
                if (niVar.M0 != 0) {
                    niVar.V1.u0();
                    niVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    eq0 eq0Var = new eq0(hashMap, arrayList, 0, true, (tn) o2Var);
                    mh mhVar = new mh(niVar, hashMap, arrayList);
                    zp0 zp0Var = eq0Var.a;
                    zp0Var.o0 = mhVar;
                    zp0 zp0Var2 = eq0Var.b;
                    zp0Var2.o0 = mhVar;
                    zp0Var.p0 = new dq0(eq0Var, 0);
                    zp0Var2.p0 = new dq0(eq0Var, 1);
                    int i11 = niVar.O1;
                    boolean z17 = niVar.P1;
                    zp0Var.f0(i11, z17);
                    eq0Var.b.f0(i11, z17);
                    if (z16) {
                        o2Var.showAsSheet(eq0Var);
                    } else {
                        o2Var.presentFragment(eq0Var);
                    }
                    niVar.dismiss();
                    break;
                }
            case 6:
                bg0 bg0Var = (bg0) this.c;
                boolean z18 = this.b;
                bg0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z19 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z18 && (!z19 || !LaunchActivity.A1)) {
                    LaunchActivity.B1 = new eu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    mu muVar = bg0Var.Q;
                    if (muVar != null) {
                        muVar.H();
                        break;
                    } else {
                        PhotoViewer photoViewer = bg0Var.R;
                        if (photoViewer != null && photoViewer.F3) {
                            if (PhotoViewer.V8 != null) {
                                PhotoViewer.V8.G0(false, true);
                            }
                            et0 et0Var = photoViewer.b0;
                            if (et0Var != null && et0Var.f != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        et0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                    }
                                }
                                et0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) et0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(et0Var.f);
                                }
                                et0Var.addView(et0Var.f, 0, i7.f6.e(-1, -1, 51));
                                bg0.j(false);
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
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                }
                            }
                            if (photoViewer.b0 != null) {
                                photoViewer.i6 = 0.0f;
                            } else if (view2 != null) {
                                photoViewer.x3 = true;
                                hk0 o10 = bg0.o(photoViewer.u2.getAspectRatio(), false);
                                float f9 = o10.c / photoViewer.t3.getLayoutParams().width;
                                photoViewer.t3.setScaleX(f9);
                                photoViewer.t3.setScaleY(f9);
                                photoViewer.t3.setTranslationX(o10.a);
                                photoViewer.t3.setTranslationY(o10.b);
                                view2.setScaleX(f9);
                                view2.setScaleY(f9);
                                view2.setTranslationX(o10.a - photoViewer.u2.getX());
                                view2.setTranslationY(o10.b - photoViewer.u2.getY());
                                qt0 qt0Var = photoViewer.A2;
                                if (qt0Var != null) {
                                    qt0Var.setScaleX(f9);
                                    photoViewer.A2.setScaleY(f9);
                                    photoViewer.A2.setTranslationX(view2.getTranslationX());
                                    photoViewer.A2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.S = 0.0f;
                                ds0 ds0Var = new ds0(photoViewer, f9, 1);
                                view2.setOutlineProvider(ds0Var);
                                view2.setClipToOutline(true);
                                photoViewer.t3.setOutlineProvider(ds0Var);
                                photoViewer.t3.setClipToOutline(true);
                                qt0 qt0Var2 = photoViewer.A2;
                                if (qt0Var2 != null) {
                                    qt0Var2.setOutlineProvider(ds0Var);
                                    photoViewer.A2.setClipToOutline(true);
                                }
                            } else {
                                bg0.j(true);
                            }
                            try {
                                photoViewer.e = true;
                                photoViewer.f = true;
                                ((WindowManager) photoViewer.y.getSystemService("window")).addView(photoViewer.c0, photoViewer.Z);
                                Activity activity = photoViewer.y;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).W0.add(photoViewer.o1);
                                }
                                zt0 zt0Var = photoViewer.Z4;
                                if (zt0Var != null && !zt0Var.s) {
                                    zt0Var.a.setVisible(false, false);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            if (photoViewer.z2) {
                                j3.k0 k0Var = photoViewer.B2.d;
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
                eb0 eb0Var = (eb0) this.c;
                if (!this.b) {
                    org.telegram.ui.Cells.q8 q8Var = eb0Var.n;
                    if (q8Var == null || !q8Var.e.h) {
                        org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                        boolean z20 = q8Var2.e.h;
                        q8Var2.setChecked(!z20);
                        eb0Var.Z(z20);
                        org.telegram.ui.Cells.q8 q8Var3 = eb0Var.n;
                        if (q8Var3 != null) {
                            if (q8Var2.e.h) {
                                q8Var3.setChecked(false);
                                eb0Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                eb0Var.r.setVisibility(8);
                                break;
                            } else if (eb0Var.e == null) {
                                q8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i12 = -eb0Var.J;
                        eb0Var.J = i12;
                        AndroidUtilities.shakeViewSpring(q8Var, i12);
                        break;
                    }
                }
                break;
            default:
                eg0 eg0Var = (eg0) this.c;
                boolean z21 = this.b;
                fg0 fg0Var = eg0Var.R;
                if (fg0Var.getParentActivity() != null) {
                    boolean z22 = !fg0Var.A;
                    fg0Var.A = z22;
                    ((org.telegram.ui.Cells.y1) view).c(z22, true);
                    if ((z21 && fg0Var.getConnectionsManager().isTestBackend()) != fg0Var.A) {
                        fg0Var.getConnectionsManager().switchBackend(false);
                    }
                    eg0Var.s();
                    break;
                }
                break;
        }
    }
}

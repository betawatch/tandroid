package ih;

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
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.yt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bb0;
import org.telegram.ui.bu0;
import org.telegram.ui.dq0;
import org.telegram.ui.eg0;
import org.telegram.ui.eq0;
import org.telegram.ui.es0;
import org.telegram.ui.fg0;
import org.telegram.ui.gt0;
import org.telegram.ui.qn;
import org.telegram.ui.st0;
import org.telegram.ui.ta1;
import org.telegram.ui.zp0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b2(int i9, Object obj, boolean z10) {
        this.a = i9;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cf cfVar;
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.c;
                boolean z10 = this.b;
                MessagesController.getInstance(i4Var.y2).setStoryQuality(!z10);
                new oc(i4Var.Y0, i4Var.x0).M(LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).j();
                b4 b4Var = i4Var.p1;
                if (b4Var != null) {
                    b4Var.a();
                    break;
                }
                break;
            case 1:
                b4 b4Var2 = (b4) this.c;
                boolean z11 = this.b;
                f1 f1Var = f1.S;
                if (f1Var != null) {
                    boolean z12 = !z11;
                    if (f1Var.n && f1Var.r != z12) {
                        f1Var.r = z12;
                        NativeInstance nativeInstance = f1Var.A;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                }
                b4 b4Var3 = b4Var2.l.p1;
                if (b4Var3 != null) {
                    b4Var3.a();
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
                org.telegram.ui.ActionBar.z zVar = w0Var.c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
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
                ta1 ta1Var = (ta1) this.c;
                boolean z14 = this.b;
                for (int i9 = 0; i9 < 2; i9++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) ta1Var.b)[i9];
                    y0Var.a.a(y0Var == view, true);
                }
                SharedConfig.setUseThreeLinesLayout(z14);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                boolean z15 = this.b;
                hd hdVar = chatActivityEnterView.A4;
                chatActivityEnterView.I0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z15 && (cfVar = chatActivityEnterView.H0) != null) {
                    cfVar.h(!S0);
                    chatActivityEnterView.H0 = null;
                    break;
                } else {
                    chatActivityEnterView.z4 = !S0;
                    AndroidUtilities.cancelRunOnUIThread(hdVar);
                    AndroidUtilities.runOnUIThread(hdVar, 500L);
                    break;
                }
            case 5:
                ki kiVar = (ki) this.c;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
                if (kiVar.M0 != 0) {
                    kiVar.V1.o();
                    kiVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    eq0 eq0Var = new eq0(hashMap, arrayList, 0, true, (qn) o2Var);
                    jh jhVar = new jh(kiVar, hashMap, arrayList);
                    zp0 zp0Var = eq0Var.a;
                    zp0Var.o0 = jhVar;
                    zp0 zp0Var2 = eq0Var.b;
                    zp0Var2.o0 = jhVar;
                    zp0Var.p0 = new dq0(eq0Var, 0);
                    zp0Var2.p0 = new dq0(eq0Var, 1);
                    int i10 = kiVar.O1;
                    boolean z17 = kiVar.P1;
                    zp0Var.e0(i10, z17);
                    eq0Var.b.e0(i10, z17);
                    if (z16) {
                        o2Var.showAsSheet(eq0Var);
                    } else {
                        o2Var.presentFragment(eq0Var);
                    }
                    kiVar.dismiss();
                    break;
                }
            case 6:
                pf0 pf0Var = (pf0) this.c;
                boolean z18 = this.b;
                pf0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z19 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z18 && (!z19 || !LaunchActivity.A1)) {
                    LaunchActivity.B1 = new yt(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    gu guVar = pf0Var.Q;
                    if (guVar != null) {
                        guVar.H();
                        break;
                    } else {
                        PhotoViewer photoViewer = pf0Var.R;
                        if (photoViewer != null && photoViewer.F3) {
                            if (PhotoViewer.V8 != null) {
                                PhotoViewer.V8.F0(false, true);
                            }
                            gt0 gt0Var = photoViewer.b0;
                            if (gt0Var != null && gt0Var.f != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        gt0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th) {
                                        FileLog.e(th);
                                    }
                                }
                                gt0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) gt0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(gt0Var.f);
                                }
                                gt0Var.addView(gt0Var.f, 0, g7.e6.e(-1, -1, 51));
                                pf0.j(false);
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
                                wj0 o6 = pf0.o(photoViewer.u2.getAspectRatio(), false);
                                float f10 = o6.c / photoViewer.t3.getLayoutParams().width;
                                photoViewer.t3.setScaleX(f10);
                                photoViewer.t3.setScaleY(f10);
                                photoViewer.t3.setTranslationX(o6.a);
                                photoViewer.t3.setTranslationY(o6.b);
                                view2.setScaleX(f10);
                                view2.setScaleY(f10);
                                view2.setTranslationX(o6.a - photoViewer.u2.getX());
                                view2.setTranslationY(o6.b - photoViewer.u2.getY());
                                st0 st0Var = photoViewer.A2;
                                if (st0Var != null) {
                                    st0Var.setScaleX(f10);
                                    photoViewer.A2.setScaleY(f10);
                                    photoViewer.A2.setTranslationX(view2.getTranslationX());
                                    photoViewer.A2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.S = 0.0f;
                                es0 es0Var = new es0(photoViewer, f10, 1);
                                view2.setOutlineProvider(es0Var);
                                view2.setClipToOutline(true);
                                photoViewer.t3.setOutlineProvider(es0Var);
                                photoViewer.t3.setClipToOutline(true);
                                st0 st0Var2 = photoViewer.A2;
                                if (st0Var2 != null) {
                                    st0Var2.setOutlineProvider(es0Var);
                                    photoViewer.A2.setClipToOutline(true);
                                }
                            } else {
                                pf0.j(true);
                            }
                            try {
                                photoViewer.e = true;
                                photoViewer.f = true;
                                ((WindowManager) photoViewer.y.getSystemService("window")).addView(photoViewer.c0, photoViewer.Z);
                                Activity activity = photoViewer.y;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).W0.add(photoViewer.o1);
                                }
                                bu0 bu0Var = photoViewer.Z4;
                                if (bu0Var != null && !bu0Var.s) {
                                    bu0Var.a.setVisible(false, false);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
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
                bb0 bb0Var = (bb0) this.c;
                if (!this.b) {
                    org.telegram.ui.Cells.t8 t8Var = bb0Var.n;
                    if (t8Var == null || !t8Var.e.h) {
                        org.telegram.ui.Cells.t8 t8Var2 = (org.telegram.ui.Cells.t8) view;
                        boolean z20 = t8Var2.e.h;
                        t8Var2.setChecked(!z20);
                        bb0Var.Y(z20);
                        org.telegram.ui.Cells.t8 t8Var3 = bb0Var.n;
                        if (t8Var3 != null) {
                            if (t8Var2.e.h) {
                                t8Var3.setChecked(false);
                                bb0Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                bb0Var.r.setVisibility(8);
                                break;
                            } else if (bb0Var.e == null) {
                                t8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i11 = -bb0Var.J;
                        bb0Var.J = i11;
                        AndroidUtilities.shakeViewSpring(t8Var, i11);
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
                    ((org.telegram.ui.Cells.z1) view).c(z22, true);
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

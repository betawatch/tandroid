package org.telegram.messenger;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dx0;
import org.telegram.ui.pe1;
import org.telegram.ui.qe1;
import org.telegram.ui.qv0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class f00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f00(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaBrowserService.Result) ((s1) this.d).b).sendResult(((i00) this.c).d((String) this.b));
                break;
            case 1:
                ((h00) this.c).q((String) this.b, (Bundle) this.d);
                break;
            case 2:
                u10 u10Var = (u10) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                s10 s10Var = (s10) this.b;
                storyItem.detectedLng = "und";
                u10Var.getMessagesController().O1().k.h(storyItem.dialogId, storyItem);
                u10Var.I.remove(s10Var);
                break;
            case 3:
                int[] iArr = (int[]) this.c;
                r20[] r20VarArr = (r20[]) this.d;
                Runnable runnable = (Runnable) this.b;
                Pattern pattern = Utilities.a;
                int i10 = iArr[0] + 1;
                iArr[0] = i10;
                if (i10 == r20VarArr.length && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                String str = (String) this.b;
                String str2 = (String) this.c;
                byte[] bArr = (byte[]) this.d;
                int i11 = WearAuthListenerService.r;
                str.getClass();
                if (str.equals("/tg-wear-auth/offer")) {
                    StringBuilder u10 = a1.g.u("wear-auth: offer from ", str2, " (");
                    u10.append(bArr.length);
                    u10.append(" bytes)");
                    f8.b(u10.toString());
                    BigInteger bigInteger = qe1.a;
                    if (bArr.length != 272) {
                        f8.b("wear-auth: malformed offer (" + bArr.length + ")");
                        break;
                    } else {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
                        bh.d dVar = qe1.d;
                        if (dVar != null && Arrays.equals((byte[]) dVar.a, copyOfRange)) {
                            f8.b("wear-auth: duplicate offer (same sessionId) — ignoring");
                            break;
                        } else {
                            f8.b("wear-auth: new session " + qe1.d(copyOfRange) + " from " + str2);
                            bh.d dVar2 = new bh.d();
                            dVar2.a = copyOfRange;
                            dVar2.b = copyOfRange2;
                            dVar2.c = str2;
                            qe1.d = dVar2;
                            Context context = LaunchActivity.I1;
                            if (context == null) {
                                context = w0.b;
                            }
                            if (context != null) {
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                org.telegram.ui.ActionBar.p6 resourceProvider = T != null ? T.getResourceProvider() : null;
                                org.telegram.ui.ActionBar.z2 z2Var = qe1.c;
                                if (z2Var != null) {
                                    z2Var.dismiss();
                                    qe1.c = null;
                                }
                                org.telegram.ui.ActionBar.z2 k10 = m5.k(1, context, resourceProvider, false);
                                pe1 pe1Var = new pe1(context);
                                k10.N = pe1Var;
                                int i12 = e20.s0;
                                ArrayList arrayList = new ArrayList();
                                arrayList.clear();
                                for (int i13 = 0; i13 < 4; i13++) {
                                    if (e20.i(i13).p()) {
                                        if (!ConnectionsManager.getInstance(i13).isTestBackend()) {
                                            i12 = i13;
                                        }
                                        arrayList.add(Integer.valueOf(i13));
                                    }
                                }
                                Collections.sort(arrayList, new dx0(7));
                                if (!arrayList.isEmpty()) {
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    int L = i0.L(14.0f);
                                    int i14 = org.telegram.ui.ActionBar.t6.i5;
                                    Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i14, resourceProvider));
                                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
                                    frameLayout2.setBackground(d02);
                                    org.telegram.ui.ActionBar.a7.k(frameLayout2, d02, N, null, resourceProvider);
                                    org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
                                    g9Var.setRoundRadius(i0.L(14.0f));
                                    g9Var.getImageReceiver().A0 = true;
                                    org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                                    int[] iArr2 = {e20.s0};
                                    TLRPC.User f7 = e20.i(iArr2[0]).f();
                                    r8Var.r(f7);
                                    g9Var.e(f7, r8Var);
                                    frameLayout2.addView(g9Var, w7.b6.e(28, 28, at.A1));
                                    ImageView imageView = new ImageView(context);
                                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                                    org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.r5, resourceProvider, PorterDuff.Mode.SRC_IN);
                                    imageView.setImageResource(R.drawable.arrows_select);
                                    frameLayout2.addView(imageView, w7.b6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                                    frameLayout.addView(frameLayout2, w7.b6.e(52, 28, 17));
                                    frameLayout.setPadding(i0.L(8.0f), i0.L(4.0f), i0.L(8.0f), 0);
                                    pe1Var.addView(frameLayout, w7.b6.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
                                    w7.e6.a(frameLayout);
                                    if (arrayList.size() <= 1) {
                                        frameLayout.setVisibility(8);
                                    }
                                    LinearLayout f10 = m5.f(context, 1);
                                    pe1Var.addView(f10, w7.b6.e(-1, -1, at.E1));
                                    org.telegram.ui.Components.g9 g9Var2 = new org.telegram.ui.Components.g9(context);
                                    f10.addView(g9Var2, w7.b6.s(at.O1, at.O1, 49, 32.0f, 32.0f, 32.0f, 9.66f));
                                    vi.b0(i12).c2(g9Var2, "Utya3D", "😎", "130_130");
                                    int i15 = org.telegram.ui.ActionBar.t6.j5;
                                    TextView b10 = w7.g6.b(context, 20.0f, i15, true, resourceProvider);
                                    m5.l(b10, 17, null, 2131742970);
                                    f10.addView(b10, w7.b6.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                                    TextView b11 = w7.g6.b(context, 14.0f, i15, false, null);
                                    m5.l(b11, 17, null, 2131742971);
                                    f10.addView(b11, w7.b6.t(-1, -2, 49, 32, 0, 32, 24));
                                    vh.d i16 = a30.i(24, context, resourceProvider, true);
                                    i16.setText(dd.L0(2131748267, null));
                                    f10.addView(i16, w7.b6.t(-1, 48, 7, 12, 12, 12, 8));
                                    int i17 = org.telegram.ui.ActionBar.t6.a7;
                                    k10.w0(i17);
                                    k10.Q(i17);
                                    frameLayout.setOnClickListener(new mg.f(k10, frameLayout2, arrayList, iArr2, r8Var, g9Var, 5));
                                    i16.setOnClickListener(new qv0(17, i16, iArr2));
                                    qe1.c = k10;
                                    k10.show();
                                    break;
                                }
                            }
                        }
                    }
                } else if (str.equals("/tg-wear-auth/cancel")) {
                    f8.b("wear-auth: cancel from " + str2);
                    BigInteger bigInteger2 = qe1.a;
                    f8.b("wear-auth: cancel received; dropping session and dismissing sheet");
                    qe1.d = null;
                    org.telegram.ui.ActionBar.z2 z2Var2 = qe1.c;
                    if (z2Var2 != null) {
                        z2Var2.dismiss();
                        qe1.c = null;
                        break;
                    }
                } else {
                    f8.b("wear-auth: unexpected path ".concat(str));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f00(h00 h00Var, String str, Bundle bundle) {
        this.a = 1;
        this.c = h00Var;
        this.b = str;
        this.d = bundle;
    }

    public /* synthetic */ f00(byte[] bArr, String str, String str2) {
        this.a = 4;
        this.b = str;
        this.c = str2;
        this.d = bArr;
    }
}

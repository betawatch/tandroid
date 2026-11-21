package org.telegram.messenger;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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
import org.telegram.ui.jg0;
import org.telegram.ui.qw0;
import org.telegram.ui.xc1;
import org.telegram.ui.yc1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class oz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oz(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((pz) this.b).q((String) this.c, (Bundle) this.d);
                break;
            case 1:
                z00 z00Var = (z00) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                x00 x00Var = (x00) this.d;
                storyItem.detectedLng = "und";
                z00Var.getMessagesController().R1().k.h(storyItem.dialogId, storyItem);
                z00Var.J.remove(x00Var);
                break;
            case 2:
                int[] iArr = (int[]) this.b;
                x10[] x10VarArr = (x10[]) this.c;
                Runnable runnable = (Runnable) this.d;
                Pattern pattern = Utilities.a;
                int i7 = iArr[0] + 1;
                iArr[0] = i7;
                if (i7 == x10VarArr.length && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                String str = (String) this.c;
                String str2 = (String) this.b;
                byte[] bArr = (byte[]) this.d;
                int i10 = WearAuthListenerService.r;
                str.getClass();
                if (str.equals("/tg-wear-auth/offer")) {
                    StringBuilder u10 = a8.p0.u("wear-auth: offer from ", str2, " (");
                    u10.append(bArr.length);
                    u10.append(" bytes)");
                    a8.b(u10.toString());
                    BigInteger bigInteger = yc1.a;
                    if (bArr.length != 272) {
                        a8.b("wear-auth: malformed offer (" + bArr.length + ")");
                        break;
                    } else {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
                        a8.r7 r7Var = yc1.d;
                        if (r7Var != null && Arrays.equals((byte[]) r7Var.b, copyOfRange)) {
                            a8.b("wear-auth: duplicate offer (same sessionId) — ignoring");
                            break;
                        } else {
                            a8.b("wear-auth: new session " + yc1.d(copyOfRange) + " from " + str2);
                            yc1.d = new a8.r7(copyOfRange, copyOfRange2, str2);
                            Context context = LaunchActivity.H1;
                            if (context == null) {
                                context = t0.b;
                            }
                            if (context != null) {
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                org.telegram.ui.ActionBar.h6 resourceProvider = T != null ? T.getResourceProvider() : null;
                                org.telegram.ui.ActionBar.w2 w2Var = yc1.c;
                                if (w2Var != null) {
                                    w2Var.dismiss();
                                    yc1.c = null;
                                }
                                org.telegram.ui.ActionBar.w2 j3 = f3.j(1, context, resourceProvider, false);
                                xc1 xc1Var = new xc1(context);
                                j3.O = xc1Var;
                                int i11 = j10.t0;
                                ArrayList arrayList = new ArrayList();
                                arrayList.clear();
                                for (int i12 = 0; i12 < 4; i12++) {
                                    if (j10.i(i12).p()) {
                                        if (!ConnectionsManager.getInstance(i12).isTestBackend()) {
                                            i11 = i12;
                                        }
                                        arrayList.add(Integer.valueOf(i12));
                                    }
                                }
                                Collections.sort(arrayList, new qw0(6));
                                if (!arrayList.isEmpty()) {
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    int L = g0.L(14.0f);
                                    int i13 = org.telegram.ui.ActionBar.m6.i5;
                                    Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i13, resourceProvider));
                                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
                                    frameLayout2.setBackground(d02);
                                    org.telegram.ui.ActionBar.t6.j(frameLayout2, d02, M, null, resourceProvider);
                                    org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
                                    q9Var.setRoundRadius(g0.L(14.0f));
                                    q9Var.getImageReceiver().B0 = true;
                                    org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
                                    int[] iArr2 = {j10.t0};
                                    TLRPC.User f10 = j10.i(iArr2[0]).f();
                                    b9Var.r(f10);
                                    q9Var.f(f10, b9Var);
                                    frameLayout2.addView(q9Var, c8.ma.e(28, 28, ks.A1));
                                    ImageView imageView = new ImageView(context);
                                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                                    org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.r5, resourceProvider, PorterDuff.Mode.SRC_IN);
                                    imageView.setImageResource(R.drawable.arrows_select);
                                    frameLayout2.addView(imageView, c8.ma.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                                    frameLayout.addView(frameLayout2, c8.ma.e(52, 28, 17));
                                    frameLayout.setPadding(g0.L(8.0f), g0.L(4.0f), g0.L(8.0f), 0);
                                    xc1Var.addView(frameLayout, c8.ma.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
                                    c8.ra.a(frameLayout);
                                    if (arrayList.size() <= 1) {
                                        frameLayout.setVisibility(8);
                                    }
                                    LinearLayout g10 = f3.g(context, 1);
                                    xc1Var.addView(g10, c8.ma.e(-1, -1, ks.E1));
                                    org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(context);
                                    g10.addView(q9Var2, c8.ma.s(ks.O1, ks.O1, 49, 32.0f, 32.0f, 32.0f, 9.66f));
                                    ri.d0(i11).h2(q9Var2, "Utya3D", "😎", "130_130");
                                    int i14 = org.telegram.ui.ActionBar.m6.j5;
                                    TextView b10 = c8.va.b(context, 20.0f, i14, true, resourceProvider);
                                    f3.k(b10, 17, null, 2131742680);
                                    g10.addView(b10, c8.ma.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                                    TextView b11 = c8.va.b(context, 14.0f, i14, false, null);
                                    f3.k(b11, 17, null, 2131742681);
                                    g10.addView(b11, c8.ma.t(-1, -2, 49, 32, 0, 32, 24));
                                    hi.e g11 = n10.g(24, context, resourceProvider, true);
                                    g11.setText(gd.N0(2131748057, null));
                                    g10.addView(g11, c8.ma.t(-1, 48, 7, 12, 12, 12, 8));
                                    int i15 = org.telegram.ui.ActionBar.m6.a7;
                                    j3.w0(i15);
                                    j3.Q(i15);
                                    frameLayout.setOnClickListener(new org.telegram.ui.Components.w1(j3, frameLayout2, arrayList, iArr2, b9Var, q9Var, 4));
                                    g11.setOnClickListener(new jg0(23, g11, iArr2));
                                    yc1.c = j3;
                                    j3.show();
                                    break;
                                }
                            }
                        }
                    }
                } else if (str.equals("/tg-wear-auth/cancel")) {
                    a8.b("wear-auth: cancel from " + str2);
                    BigInteger bigInteger2 = yc1.a;
                    a8.b("wear-auth: cancel received; dropping session and dismissing sheet");
                    yc1.d = null;
                    org.telegram.ui.ActionBar.w2 w2Var2 = yc1.c;
                    if (w2Var2 != null) {
                        w2Var2.dismiss();
                        yc1.c = null;
                        break;
                    }
                } else {
                    a8.b("wear-auth: unexpected path ".concat(str));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ oz(byte[] bArr, String str, String str2) {
        this.a = 3;
        this.c = str;
        this.b = str2;
        this.d = bArr;
    }
}

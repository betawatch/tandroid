// default package

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class h68 implements y78, a78, OnSuccessListener, ee, yl0, g94, l8, oac, qq7, kac, hj6, yy5, d19, h59, ou3, vd9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h68(pf3 pf3Var, u79 u79Var) {
        this.a = (byte) 25;
        this.b = pf3Var;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 11:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                iq5 H0 = gm.H0(wzcVar, false);
                premiumPreviewFragment.p0 = H0;
                premiumPreviewFragment.a.setPadding(0, H0.b, 0, gm.L(48.0f) + premiumPreviewFragment.p0.d);
                r59 r59Var = premiumPreviewFragment.a;
                iq5 iq5Var = premiumPreviewFragment.p0;
                gm.v3(r59Var, iq5Var.a, 0, iq5Var.c, 0);
                gk8 gk8Var = premiumPreviewFragment.V;
                iq5 iq5Var2 = premiumPreviewFragment.p0;
                gk8Var.setPadding(iq5Var2.a, 0, iq5Var2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.K;
                if (frameLayout != null) {
                    int i = premiumPreviewFragment.p0.a;
                    int L = gm.L(14.0f);
                    iq5 iq5Var3 = premiumPreviewFragment.p0;
                    frameLayout.setPadding(i, L, iq5Var3.c, iq5Var3.d);
                }
                break;
            default:
                ku8 ku8Var = (ku8) obj;
                ku8Var.I = wzcVar.a.f(647);
                ku8Var.h.requestLayout();
                break;
        }
        return wzc.b;
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        lf8 lf8Var = (lf8) this.b;
        lka lkaVar = lf8Var.f;
        wp4.d(lkaVar, lf8Var.I.e);
        int i2 = cmb.z6;
        yv1 yv1Var = lf8Var.d;
        lkaVar.setTextColor(on2.f(lf8Var.J.e, cmb.v0(i2, yv1Var.getResourceProvider()), cmb.v0(cmb.o7, yv1Var.getResourceProvider())));
    }

    @Override // hj6
    public final boolean a(ij6 ij6Var, boolean z) {
        jm8 jm8Var = (jm8) this.b;
        if (!z) {
            return true;
        }
        jm8Var.d.Z((Long) ij6Var.getTag(), ij6Var);
        return true;
    }

    @Override // l8
    public final void b() {
        ((xg8) this.b).e();
    }

    public final void c(int i) {
        jd9 jd9Var = (jd9) this.b;
        jd9Var.c = i;
        jd9Var.e(i);
    }

    @Override // vd9
    public final bu5 d(ne9 ne9Var) {
        return bu5.I((jf9) ((cf9) this.b).b, ne9Var);
    }

    @Override // a78
    public final void e(int i, int i2) {
        n78 n78Var = (n78) ((s30) this.b).e;
        if (i == n78Var.b) {
            n78Var.H = i2;
        } else if (i == n78Var.r) {
            n78Var.Q = i2;
        } else if (i == n78Var.d) {
            n78Var.J = i2;
        } else if (i == n78Var.c) {
            n78Var.I = i2;
        } else if (i == n78Var.f) {
            n78Var.K = i2;
        } else if (i == n78Var.e) {
            n78Var.L = i2;
        } else if (i == n78Var.w) {
            n78Var.S = i2;
        } else if (i == n78Var.s) {
            n78Var.R = i2;
        } else if (i == n78Var.x) {
            n78Var.T = i2;
        } else if (i == n78Var.y) {
            n78Var.V = i2;
        } else if (i == n78Var.h) {
            n78Var.M = i2;
        } else if (i == n78Var.n) {
            n78Var.N = i2;
        }
        uf4 uf4Var = n78Var.m0;
        if (uf4Var != null) {
            uf4Var.b(true, false, false);
        }
        n78Var.g();
    }

    @Override // h59
    public final boolean g(int i, View view) {
        b29 b29Var;
        c29 c29Var = (c29) this.b;
        ArrayList arrayList = c29Var.n;
        if (c29Var.f.d(i) != 0 || (b29Var = c29Var.G) == null) {
            return true;
        }
        b29Var.i(k47.B1(((TLRPC.MessagePeerReaction) arrayList.get(i)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i));
        return true;
    }

    @Override // kac
    public final Object j(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((bm8) this.b).d;
        if (num.intValue() != 0) {
            return jb6.E(num2.intValue(), ',');
        }
        if (privacyControlActivity.getUserConfig().p()) {
            return jb6.H(',', "Stars", num2.intValue());
        }
        if (privacyControlActivity.B0 == null) {
            SpannableString spannableString = new SpannableString("l");
            pn2 pn2Var = new pn2(R.drawable.msg_mini_lock3, 0);
            float L = gm.L(2.0f);
            float L2 = gm.L(1.0f);
            pn2Var.r = L;
            pn2Var.s = L2;
            spannableString.setSpan(pn2Var, 0, 1, 33);
            privacyControlActivity.B0 = spannableString;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) privacyControlActivity.B0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) jb6.H(',', "Stars", num2.intValue()));
        return spannableStringBuilder;
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 10:
                ai8 ai8Var = (ai8) obj3;
                Object obj4 = ((c6c) obj).H;
                if (obj4 instanceof k47) {
                    k47 k47Var = (k47) obj4;
                    Bundle bundle = new Bundle();
                    long B0 = k47.B0(k47Var.k);
                    TLRPC.Message message = k47Var.k;
                    if (B0 >= 0) {
                        bundle.putLong("user_id", k47.B0(message));
                    } else {
                        bundle.putLong("chat_id", -k47.B0(message));
                    }
                    bundle.putInt("message_id", k47Var.e1());
                    yv1 yv1Var = new yv1(bundle);
                    d dVar = ai8Var.a;
                    nk3.C3(yv1Var, k47Var);
                    dVar.presentFragment(yv1Var);
                    break;
                }
                break;
            case 24:
                Canvas canvas = (Canvas) obj;
                RectF rectF = (RectF) obj2;
                float floatValue = ((Float) number).floatValue();
                float floatValue2 = ((Float) serializable).floatValue();
                float floatValue3 = ((Float) serializable2).floatValue();
                ylb ylbVar = ((r59) obj3).o2;
                Paint paint = r59.c3;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                paint.setColor(cmb.p1(floatValue3, cmb.v0(cmb.c6, ylbVar)));
                if (floatValue <= 0.0f && floatValue2 <= 0.0f) {
                    canvas.drawRect(rectF, paint);
                    break;
                } else if (floatValue != floatValue2) {
                    Path path = r59.d3;
                    path.rewind();
                    float[] fArr = r59.e3;
                    fArr[3] = floatValue;
                    fArr[2] = floatValue;
                    fArr[1] = floatValue;
                    fArr[0] = floatValue;
                    fArr[7] = floatValue2;
                    fArr[6] = floatValue2;
                    fArr[5] = floatValue2;
                    fArr[4] = floatValue2;
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas.drawPath(path, paint);
                    break;
                } else {
                    canvas.drawRoundRect(rectF, floatValue, floatValue, paint);
                    break;
                }
                break;
            default:
                ca9 ca9Var = (ca9) obj3;
                c6c c6cVar = (c6c) obj;
                da9 da9Var = ca9Var.w;
                if (c6cVar.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = ca9Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = ca9Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = ca9Var.d;
                            if (tL_reportResultAddComment == null) {
                                CharSequence charSequence = c6cVar.m;
                                int i = da9.v1;
                                da9Var.K0(charSequence, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    int i2 = da9.v1;
                                    da9Var.K0(null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(c6cVar.d);
                            if (tL_messageReportOption != null) {
                                String str = tL_messageReportOption.text;
                                byte[] bArr2 = tL_messageReportOption.option;
                                int i3 = da9.v1;
                                da9Var.K0(str, bArr2, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(c6cVar.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            String str2 = tL_sponsoredMessageReportOption.text;
                            byte[] bArr3 = tL_sponsoredMessageReportOption.option;
                            int i4 = da9.v1;
                            da9Var.K0(str2, bArr3, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // ou3
    public final void m() {
        be9 be9Var = (be9) this.b;
        ne9 ne9Var = be9Var.d;
        ll0 ll0Var = be9Var.f;
        if (ll0Var != null) {
            ll0Var.s = true;
            ll0Var.r = ne9Var.q2;
        }
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = zk9.f(ne9Var.getText());
            }
        }
        lg9 lg9Var = be9Var.h;
        if (lg9Var == null || be9Var.f == null) {
            return;
        }
        lg9Var.a.W3();
    }

    @Override // yl0
    public final void n(Canvas canvas, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                ((jc8) obj).f(canvas, i);
                break;
            default:
                wz8 wz8Var = (wz8) obj;
                canvas.save();
                RectF rectF = wz8Var.r;
                canvas.translate(-rectF.left, (-rectF.top) + gm.L(30.0f));
                wz8Var.e(canvas, true, i);
                canvas.restore();
                break;
        }
    }

    @Override // yy5
    public final void o(Exception exc) {
        qu quVar = (qu) this.b;
        RectF rectF = ProfileActivity.e7;
        fc4.e("mlkit: failed to detect language in selection", exc);
        quVar.run();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        g88 g88Var = (g88) this.b;
        g88Var.E0 = true;
        g88Var.D0 = false;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        int i2;
        int i3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) ((m41) obj).c;
                try {
                    gm.r2(photoViewer.S4, photoViewer.E, photoViewer.w2, true);
                    photoViewer.A(false, false);
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 6:
                ((kg8) obj).finishFragment();
                break;
            case 7:
                ((eg8) obj).a.S.p();
                break;
            case 9:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                int i4 = PopupNotificationActivity.c0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 14:
                RectF rectF = ProfileActivity.e7;
                ((un8) obj).a(1);
                break;
            case 19:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((kx7) obj).c;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    gda.i((fda) obj2);
                }
                if (gda.x1 == null) {
                    proxyListActivity.d = false;
                }
                nm7.e().n(proxyListActivity, nm7.E4);
                nm7.e().k(nm7.E4, new Object[0]);
                nm7.e().b(proxyListActivity, nm7.E4);
                proxyListActivity.h0(true);
                s30 s30Var = proxyListActivity.a;
                if (s30Var != null) {
                    if (gda.x1 == null) {
                        i2 = proxyListActivity.useProxyRow;
                        s30Var.h(i2, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            default:
                lz8 lz8Var = (lz8) ((im8) obj).b;
                i3 = ((d) lz8Var).currentAccount;
                pz8 f = pz8.f(i3);
                ArrayList arrayList2 = lz8Var.b;
                int i6 = f.a;
                int i7 = 0;
                while (i7 < arrayList2.size()) {
                    if (f.c(((Integer) arrayList2.get(i7)).intValue()) == null) {
                        arrayList2.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                if (!arrayList2.isEmpty()) {
                    for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                        oz8 c = f.c(((Integer) arrayList2.get(i8)).intValue());
                        f.b.remove(c);
                        f.a(c.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c.a;
                        ConnectionsManager.getInstance(i6).sendRequest(tL_messages_deleteQuickReplyShortcut, new nf2((byte) 6));
                        if ("hello".equals(c.b)) {
                            ConnectionsManager.getInstance(i6).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull X1 = oc7.r1(i6).X1(z8c.h(i6).e());
                            if (X1 != null) {
                                X1.flags2 &= -5;
                                X1.business_greeting_message = null;
                                cf7.Y(i6).g2(X1, true);
                            }
                        } else if ("away".equals(c.b)) {
                            ConnectionsManager.getInstance(i6).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull X12 = oc7.r1(i6).X1(z8c.h(i6).e());
                            if (X12 != null) {
                                X12.flags2 &= -9;
                                X12.business_away_message = null;
                                cf7.Y(i6).g2(X12, true);
                            }
                        }
                    }
                    f.l();
                    cf7 Y = cf7.Y(i6);
                    Y.a.c(new p51(Y, arrayList2, (byte) 24));
                    nm7.f(i6).k(nm7.F1, new Object[0]);
                }
                lz8Var.e0();
                break;
        }
    }

    public /* synthetic */ h68(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}

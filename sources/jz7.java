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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;
import org.webrtc.AudioSource;
import org.webrtc.MediaConstraints;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnectionFactory;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jz7 implements ncc, NativeLifecycleLock.NativePointerCallable, h56, n98, p88, OnSuccessListener, fd, zk0, s84, m8, nr7, jcc, kj6, dz5, p29, t69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jz7(ye3 ye3Var, f99 f99Var) {
        this.a = (byte) 28;
        this.b = ye3Var;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 14:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                mq5 H0 = hl.H0(l2dVar, false);
                premiumPreviewFragment.p0 = H0;
                premiumPreviewFragment.a.setPadding(0, H0.b, 0, hl.L(48.0f) + premiumPreviewFragment.p0.d);
                d79 d79Var = premiumPreviewFragment.a;
                mq5 mq5Var = premiumPreviewFragment.p0;
                hl.v3(d79Var, mq5Var.a, 0, mq5Var.c, 0);
                rl8 rl8Var = premiumPreviewFragment.V;
                mq5 mq5Var2 = premiumPreviewFragment.p0;
                rl8Var.setPadding(mq5Var2.a, 0, mq5Var2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.K;
                if (frameLayout != null) {
                    int i = premiumPreviewFragment.p0.a;
                    int L = hl.L(14.0f);
                    mq5 mq5Var3 = premiumPreviewFragment.p0;
                    frameLayout.setPadding(i, L, mq5Var3.c, mq5Var3.d);
                }
                break;
            default:
                sv8 sv8Var = (sv8) obj;
                sv8Var.I = l2dVar.a.f(647);
                sv8Var.h.requestLayout();
                break;
        }
        return l2d.b;
    }

    @Override // kj6
    public final boolean a(lj6 lj6Var, boolean z) {
        un8 un8Var = (un8) this.b;
        if (!z) {
            return true;
        }
        un8Var.d.Y((Long) lj6Var.getTag(), lj6Var);
        return true;
    }

    @Override // m8
    public final void c() {
        ((ji8) this.b).e();
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        AudioSource lambda$createAudioSource$5;
        lambda$createAudioSource$5 = PeerConnectionFactory.lambda$createAudioSource$5((MediaConstraints) this.b, j);
        return lambda$createAudioSource$5;
    }

    @Override // h56
    public final void d() {
        ((w68) this.b).E0(true);
    }

    @Override // t69
    public final boolean e(int i, View view) {
        n39 n39Var;
        o39 o39Var = (o39) this.b;
        ArrayList arrayList = o39Var.n;
        if (o39Var.f.d(i) != 0 || (n39Var = o39Var.G) == null) {
            return true;
        }
        n39Var.g(r47.B1(((TLRPC.MessagePeerReaction) arrayList.get(i)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i));
        return true;
    }

    @Override // jcc
    public final Object g(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((mn8) this.b).d;
        if (num.intValue() != 0) {
            return ob6.E(num2.intValue(), ',');
        }
        if (privacyControlActivity.getUserConfig().p()) {
            return ob6.H(',', "Stars", num2.intValue());
        }
        if (privacyControlActivity.B0 == null) {
            SpannableString spannableString = new SpannableString("l");
            wm2 wm2Var = new wm2(R.drawable.msg_mini_lock3, 0);
            float L = hl.L(2.0f);
            float L2 = hl.L(1.0f);
            wm2Var.r = L;
            wm2Var.s = L2;
            spannableString.setSpan(wm2Var, 0, 1, 33);
            privacyControlActivity.B0 = spannableString;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) privacyControlActivity.B0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) ob6.H(',', "Stars", num2.intValue()));
        return spannableStringBuilder;
    }

    @Override // p88
    public final void i(int i, int i2) {
        c98 c98Var = (c98) ((t20) this.b).e;
        if (i == c98Var.b) {
            c98Var.H = i2;
        } else if (i == c98Var.r) {
            c98Var.Q = i2;
        } else if (i == c98Var.d) {
            c98Var.J = i2;
        } else if (i == c98Var.c) {
            c98Var.I = i2;
        } else if (i == c98Var.f) {
            c98Var.K = i2;
        } else if (i == c98Var.e) {
            c98Var.L = i2;
        } else if (i == c98Var.w) {
            c98Var.S = i2;
        } else if (i == c98Var.s) {
            c98Var.R = i2;
        } else if (i == c98Var.x) {
            c98Var.T = i2;
        } else if (i == c98Var.y) {
            c98Var.V = i2;
        } else if (i == c98Var.h) {
            c98Var.M = i2;
        } else if (i == c98Var.n) {
            c98Var.N = i2;
        }
        rf4 rf4Var = c98Var.m0;
        if (rf4Var != null) {
            rf4Var.b(true, false, false);
        }
        c98Var.e();
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((PasskeysActivity) obj3).c0((b8c) obj, (View) obj2);
                break;
            case 13:
                mj8 mj8Var = (mj8) obj3;
                Object obj4 = ((b8c) obj).H;
                if (obj4 instanceof r47) {
                    r47 r47Var = (r47) obj4;
                    Bundle bundle = new Bundle();
                    long B0 = r47.B0(r47Var.k);
                    TLRPC.Message message = r47Var.k;
                    if (B0 >= 0) {
                        bundle.putLong("user_id", r47.B0(message));
                    } else {
                        bundle.putLong("chat_id", -r47.B0(message));
                    }
                    bundle.putInt("message_id", r47Var.e1());
                    zu1 zu1Var = new zu1(bundle);
                    e eVar = mj8Var.a;
                    uj3.C3(zu1Var, r47Var);
                    eVar.presentFragment(zu1Var);
                    break;
                }
                break;
            case 27:
                Canvas canvas = (Canvas) obj;
                RectF rectF = (RectF) obj2;
                float floatValue = ((Float) number).floatValue();
                float floatValue2 = ((Float) serializable).floatValue();
                float floatValue3 = ((Float) serializable2).floatValue();
                vnb vnbVar = ((d79) obj3).o2;
                Paint paint = d79.c3;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                paint.setColor(aob.p1(floatValue3, aob.v0(aob.d6, vnbVar)));
                if (floatValue <= 0.0f && floatValue2 <= 0.0f) {
                    canvas.drawRect(rectF, paint);
                    break;
                } else if (floatValue != floatValue2) {
                    Path path = d79.d3;
                    path.rewind();
                    float[] fArr = d79.e3;
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
                mb9 mb9Var = (mb9) obj3;
                b8c b8cVar = (b8c) obj;
                nb9 nb9Var = mb9Var.w;
                if (b8cVar.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = mb9Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = mb9Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = mb9Var.d;
                            if (tL_reportResultAddComment == null) {
                                CharSequence charSequence = b8cVar.m;
                                int i = nb9.v1;
                                nb9Var.L0(charSequence, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    int i2 = nb9.v1;
                                    nb9Var.L0(null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(b8cVar.d);
                            if (tL_messageReportOption != null) {
                                String str = tL_messageReportOption.text;
                                byte[] bArr2 = tL_messageReportOption.option;
                                int i3 = nb9.v1;
                                nb9Var.L0(str, bArr2, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(b8cVar.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            String str2 = tL_sponsoredMessageReportOption.text;
                            byte[] bArr3 = tL_sponsoredMessageReportOption.option;
                            int i4 = nb9.v1;
                            nb9Var.L0(str2, bArr3, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // dz5
    public final void l(Exception exc) {
        st stVar = (st) this.b;
        RectF rectF = ProfileActivity.Z6;
        cc4.e("mlkit: failed to detect language in selection", exc);
        stVar.run();
    }

    @Override // zk0
    public final void n(Canvas canvas, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 7:
                ((xd8) obj).j(canvas, i);
                break;
            default:
                i19 i19Var = (i19) obj;
                canvas.save();
                RectF rectF = i19Var.r;
                canvas.translate(-rectF.left, (-rectF.top) + hl.L(30.0f));
                i19Var.e(canvas, true, i);
                canvas.restore();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        v98 v98Var = (v98) this.b;
        v98Var.E0 = true;
        v98Var.D0 = false;
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        xg8 xg8Var = (xg8) this.b;
        ema emaVar = xg8Var.f;
        zp4.d(emaVar, xg8Var.I.e);
        int i2 = aob.A6;
        zu1 zu1Var = xg8Var.d;
        emaVar.setTextColor(vm2.f(xg8Var.J.e, aob.v0(i2, zu1Var.getResourceProvider()), aob.v0(aob.p7, zu1Var.getResourceProvider())));
    }

    @Override // fd
    public final void w(id idVar, int i) {
        int i2;
        int i3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) ((n31) obj).c;
                try {
                    hl.r2(photoViewer.S4, photoViewer.E, photoViewer.w2, true);
                    photoViewer.A(false, false);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 9:
                ((wh8) obj).finishFragment();
                break;
            case 10:
                ((qh8) obj).a.S.p();
                break;
            case 12:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                int i4 = PopupNotificationActivity.c0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 18:
                RectF rectF = ProfileActivity.Z6;
                ((cp8) obj).a(1);
                break;
            case 22:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((py7) obj).c;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    xea.i((wea) obj2);
                }
                if (xea.x1 == null) {
                    proxyListActivity.d = false;
                }
                jn7.e().n(proxyListActivity, jn7.D4);
                jn7.e().k(jn7.D4, new Object[0]);
                jn7.e().b(proxyListActivity, jn7.D4);
                proxyListActivity.g0(true);
                t20 t20Var = proxyListActivity.a;
                if (t20Var != null) {
                    if (xea.x1 == null) {
                        i2 = proxyListActivity.useProxyRow;
                        t20Var.h(i2, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            default:
                x09 x09Var = (x09) ((rn8) obj).b;
                i3 = ((e) x09Var).currentAccount;
                b19 f = b19.f(i3);
                ArrayList arrayList2 = x09Var.b;
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
                        a19 c = f.c(((Integer) arrayList2.get(i8)).intValue());
                        f.b.remove(c);
                        f.a(c.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c.a;
                        ConnectionsManager.getInstance(i6).sendRequest(tL_messages_deleteQuickReplyShortcut, new xe2((byte) 6));
                        if ("hello".equals(c.b)) {
                            ConnectionsManager.getInstance(i6).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull Y1 = uc7.s1(i6).Y1(yac.h(i6).e());
                            if (Y1 != null) {
                                Y1.flags2 &= -5;
                                Y1.business_greeting_message = null;
                                kf7.a0(i6).l2(Y1, true);
                            }
                        } else if ("away".equals(c.b)) {
                            ConnectionsManager.getInstance(i6).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull Y12 = uc7.s1(i6).Y1(yac.h(i6).e());
                            if (Y12 != null) {
                                Y12.flags2 &= -9;
                                Y12.business_away_message = null;
                                kf7.a0(i6).l2(Y12, true);
                            }
                        }
                    }
                    f.l();
                    kf7 a0 = kf7.a0(i6);
                    a0.a.c(new q41(a0, arrayList2, (byte) 24));
                    jn7.f(i6).k(jn7.F1, new Object[0]);
                }
                x09Var.d0();
                break;
        }
    }

    public /* synthetic */ jz7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // h56
    public final void b() {
    }

    @Override // h56
    public final void f() {
    }

    @Override // h56
    public final void h() {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}

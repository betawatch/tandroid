// default package

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.m;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements ee, RequestTimeDelegate, dt, g59, xgc, w18, ue7, c5c, k01, o01, RequestDelegateTimestamp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // xgc
    public final void a(View view, RectF rectF) {
        im0 im0Var = (im0) this.b;
        WeakReference weakReference = (WeakReference) this.c;
        im0Var.i(rectF.left, rectF.top);
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // o01
    public final void b(n01 n01Var) {
        int i;
        n01 n01Var2;
        p01 p01Var = (p01) this.b;
        o01 o01Var = (o01) this.c;
        if (n01Var.a != 0 || p01Var.b != 0) {
            o01Var.b(n01Var);
            return;
        }
        int i2 = n01Var.c;
        String probeListenerAudio = i2 > 0 ? NativeInstance.probeListenerAudio(n01Var.b, i2) : null;
        if (probeListenerAudio == null) {
            n01Var2 = new n01(n01Var.a, n01Var.b, n01Var.c, n01Var.d, 0, n01Var.f);
        } else {
            String[] split = probeListenerAudio.split("\n");
            try {
                i = Integer.parseInt(split[0]);
            } catch (NumberFormatException unused) {
                i = 0;
            }
            HashMap hashMap = new HashMap();
            for (int i3 = 1; i3 < split.length; i3++) {
                int lastIndexOf = split[i3].lastIndexOf(61);
                if (lastIndexOf > 0) {
                    try {
                        hashMap.put(split[i3].substring(0, lastIndexOf), Integer.valueOf(Integer.parseInt(split[i3].substring(lastIndexOf + 1))));
                    } catch (NumberFormatException unused2) {
                    }
                }
            }
            n01Var2 = new n01(n01Var.a, n01Var.b, n01Var.c, n01Var.d, Math.max(i, 0), hashMap);
        }
        o01Var.b(n01Var2);
    }

    @Override // w18
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 21:
                to0 to0Var = (to0) obj2;
                to0 to0Var2 = (to0) obj;
                if (i != 1) {
                    if (i != 3) {
                        to0Var2.a(null);
                        break;
                    }
                } else {
                    to0Var.a(null);
                    break;
                }
                break;
            default:
                qac qacVar = (qac) obj2;
                qac qacVar2 = (qac) obj;
                if (i != 1) {
                    if (i != 3) {
                        qacVar2.a(null);
                        break;
                    }
                } else {
                    qacVar.a(null);
                    break;
                }
                break;
        }
    }

    @Override // k01
    public final void cancel() {
        f11 f11Var = (f11) this.b;
        f11Var.b.removeCallbacks((x30) this.c);
    }

    @Override // g59
    public final void d(float f, float f2, int i, View view) {
        org.telegram.ui.o oVar = (org.telegram.ui.o) this.b;
        m mVar = (m) this.c;
        if (oVar.L == null || i - 1 >= 0) {
            gkb gkbVar = oVar.Q0;
            if (gkbVar != null) {
                boolean w = gkbVar.w();
                gkb gkbVar2 = oVar.Q0;
                if (w) {
                    gkbVar2.e(false);
                    return;
                }
                gkbVar2.e(false);
            }
            ey adapter = mVar.getAdapter();
            if ((view instanceof mx) && adapter.F != null) {
                mx mxVar = (mx) view;
                if (oVar.I0 == 0) {
                    if ((!mxVar.c || f >= view.getMeasuredWidth() / 2) && !mxVar.d) {
                        TLObject b2 = oc7.r1(oVar.Y).b2("previews");
                        if (b2 instanceof TLRPC.TL_user) {
                            oVar.N(adapter.F.id, (TLRPC.User) b2);
                            return;
                        }
                        int i2 = z8c.t0;
                        long j = adapter.F.id;
                        oVar.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        oVar.I0 = ConnectionsManager.getInstance(i2).sendRequest(tL_contacts_resolveUsername, new ju(oVar, i2, j));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i < 0 || i >= adapter.d.size()) {
                return;
            }
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i);
            TL_iv.PageBlock w2 = org.telegram.ui.o.w(pageBlock);
            if (w2 instanceof tx) {
                w2 = ((tx) w2).b;
            }
            if (w2 instanceof TL_iv.pageBlockChannel) {
                oc7.r1(oVar.Y).C3(sd2.K(((TL_iv.pageBlockChannel) w2).channel, false), oVar.N, 2, null);
                oVar.l(false, true);
                return;
            }
            if (w2 instanceof zx) {
                zx zxVar = (zx) w2;
                oVar.O(zxVar.a.articles.get(zxVar.b).url, null, null);
                return;
            }
            if (w2 instanceof TL_iv.pageBlockDetails) {
                View v = org.telegram.ui.o.v(view);
                if (v instanceof ov) {
                    oVar.d = null;
                    oVar.f = null;
                    if (adapter.e.indexOf(pageBlock) >= 0) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) w2;
                        pageblockdetails.open = !pageblockdetails.open;
                        int b = adapter.b();
                        adapter.M();
                        int abs = Math.abs(adapter.b() - b);
                        ov ovVar = (ov) v;
                        ovVar.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                        ovVar.invalidate();
                        if (abs != 0) {
                            int i3 = i + 1;
                            if (pageblockdetails.open) {
                                adapter.p(i3, abs);
                            } else {
                                adapter.q(i3, abs);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // c5c
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((au0) this.b).p0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        int i2 = 3600;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                a1 a1Var = (a1) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                k11 g = heVar.g(-1, true, true);
                g.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(a1Var.a).sendRequestTyped(deletetone, new kc(objArr2 == true ? 1 : 0), new p((Object) a1Var, (Object) g, (Object) tL_aiComposeTone, (byte) (objArr == true ? 1 : 0)));
                break;
            case 1:
                ((zn) obj2).z(((boolean[]) obj)[0]);
                break;
            case 2:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) obj2;
                LaunchActivity launchActivity = (LaunchActivity) obj;
                hb6 F0 = jb6.D0().F0(b10.h(tL_langPackLanguage.official ? "remote_" : "unofficial_", tL_langPackLanguage.lang_code));
                if (F0 == null) {
                    F0 = new hb6();
                    F0.a = tL_langPackLanguage.native_name;
                    F0.b = tL_langPackLanguage.name;
                    F0.c = tL_langPackLanguage.lang_code;
                    F0.e = tL_langPackLanguage.base_lang_code;
                    F0.f = tL_langPackLanguage.plural_code;
                    F0.g = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        F0.d = "remote";
                    } else {
                        F0.d = "unofficial";
                    }
                }
                jb6.D0().c(F0, true, false, false, true, z8c.t0, null);
                launchActivity.y0(true);
                break;
            case 3:
                x92 x92Var = (x92) obj2;
                boolean[] zArr = (boolean[]) obj;
                boolean z = zArr[0];
                boolean z2 = zArr[1];
                nk3 nk3Var = (nk3) x92Var.b;
                ArrayList arrayList = (ArrayList) x92Var.c;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Long l = (Long) arrayList.get(i3);
                    long longValue = l.longValue();
                    if (z) {
                        nk3Var.getMessagesController().t4(longValue, nk3Var.getMessagesController().W1(l), null, null, false);
                    }
                    if (z2) {
                        nk3Var.getMessagesController().T(0, longValue, true);
                    }
                    nk3Var.getMessagesController().t(longValue);
                }
                nk3Var.A3(false);
                break;
            case 4:
                heVar.dismiss();
                ((x0) obj2).a(((EditText) obj).getText().toString());
                break;
            case 5:
                we7 we7Var = (we7) obj;
                int i4 = ((int[]) obj2)[0];
                if (i4 == 0) {
                    i2 = 900;
                } else if (i4 != 1) {
                    i2 = i4 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                we7Var.a(i2);
                break;
            case 6:
                ((AtomicBoolean) obj2).set(true);
                ((gu2) obj).accept(Boolean.FALSE);
                break;
            case 7:
                mj mjVar = (mj) obj2;
                qac qacVar = (qac) obj;
                String trim = mjVar.getText().toString().trim();
                if (TextUtils.isEmpty(trim) ? false : ik.a.matcher(trim.trim()).matches()) {
                    qacVar.a(trim);
                    heVar.dismiss();
                    break;
                } else {
                    gm.z3(mjVar);
                    break;
                }
            case 8:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) obj2;
                int i5 = encryptedChat.ttl;
                int value = ((lp7) obj).getValue();
                if (value >= 0 && value < 16) {
                    encryptedChat.ttl = value;
                } else if (value == 16) {
                    encryptedChat.ttl = 30;
                } else if (value == 17) {
                    encryptedChat.ttl = 60;
                } else if (value == 18) {
                    encryptedChat.ttl = 3600;
                } else if (value == 19) {
                    encryptedChat.ttl = 86400;
                } else if (value == 20) {
                    encryptedChat.ttl = 604800;
                }
                if (i5 != encryptedChat.ttl) {
                    dw9.i(z8c.t0).z(encryptedChat, null);
                    cf7 Y = cf7.Y(z8c.t0);
                    Y.a.c(new gd7(Y, encryptedChat, objArr3 == true ? 1 : 0));
                    break;
                }
                break;
            case 9:
                SharedPreferences.Editor edit = oc7.r1(z8c.t0).W3.edit();
                edit.remove("color_" + ((String) obj2));
                edit.commit();
                ((Runnable) obj).run();
                break;
            case 10:
                ((ue7) obj2).z(((boolean[]) obj)[0]);
                break;
            case 11:
                ((SharedPreferences) obj2).edit().putBoolean("proxycheckstatusip", true).apply();
                ((op6) obj).run();
                break;
            case 12:
            case 13:
            case 14:
            case 17:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                boolean[] zArr2 = (boolean[]) obj2;
                JsPromptResult jsPromptResult = (JsPromptResult) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            case 15:
                tz tzVar = (tz) obj2;
                pz pzVar = (pz) obj;
                try {
                    int parseInt = Integer.parseInt(pzVar.getText().toString().trim());
                    tzVar.b1(parseInt);
                    tzVar.X1.setValue(parseInt);
                    heVar.dismiss();
                    break;
                } catch (Throwable th) {
                    gm.z3(pzVar);
                    fc4.g(th, true);
                    return;
                }
            case 16:
                heVar.dismiss();
                ((v70) obj2).b0((View) obj, true);
                break;
            case 18:
                ((dn0) obj2).j0((HashSet) obj);
                break;
            case 19:
                ((AtomicBoolean) obj2).set(true);
                ((w0a) obj).run();
                break;
            case 20:
                ((to0) obj2).a((TLRPC.TL_premiumGiftCodeOption) obj);
                break;
            case 25:
                qw0 qw0Var = (qw0) obj2;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = oc7.r1(qw0Var.N).p1(qw0Var.V);
                ConnectionsManager.getInstance(qw0Var.N).sendRequest(allowsendmessage, new eo0((Object) qw0Var, obj, (Object) heVar, (byte) 8));
                break;
        }
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j) {
        ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList;
        h11 h11Var = (h11) this.b;
        c01 c01Var = (c01) this.c;
        long j2 = 0;
        if (tLObject instanceof TL_phone.groupCallStreamChannels) {
            arrayList = ((TL_phone.groupCallStreamChannels) tLObject).channels;
            if (!arrayList.isEmpty() && arrayList.get(0).last_timestamp_ms > 0) {
                j2 = arrayList.get(0).last_timestamp_ms + 1000;
            }
        } else {
            arrayList = null;
        }
        h11Var.e.execute(new p97((Object) h11Var, (Object) arrayList, (Object) c01Var, j2, (byte) 3));
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    @Override // ue7
    public final void z(boolean z) {
        rs0 rs0Var = (rs0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        yv1 j0 = rs0Var.j0();
        if (j0 != null) {
            j0.removeSelfFromStack();
        }
        rs0Var.finishFragment();
        rs0Var.getNotificationCenter().k(nm7.K2, Long.valueOf(rs0Var.a), user, null, Boolean.valueOf(z));
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public final void run(long j) {
        gm.c3(new of2(this.b, j, this.c, (byte) 10));
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }
}

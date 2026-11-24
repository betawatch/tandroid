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
import org.telegram.tgnet.NativeByteBuffer;
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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements ed, RequestTimeDelegate, ds, d39, xec, tz7, b3c, dz0, hz0, RequestDelegateTimestamp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // xec
    public final void a(View view, RectF rectF) {
        il0 il0Var = (il0) this.b;
        WeakReference weakReference = (WeakReference) this.c;
        il0Var.i(rectF.left, rectF.top);
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // hz0
    public final void b(gz0 gz0Var) {
        int i;
        gz0 gz0Var2;
        iz0 iz0Var = (iz0) this.b;
        hz0 hz0Var = (hz0) this.c;
        if (gz0Var.a != 0 || iz0Var.b != 0) {
            hz0Var.b(gz0Var);
            return;
        }
        int i2 = gz0Var.c;
        String probeListenerAudio = i2 > 0 ? NativeInstance.probeListenerAudio(gz0Var.b, i2) : null;
        if (probeListenerAudio == null) {
            gz0Var2 = new gz0(gz0Var.a, gz0Var.b, gz0Var.c, gz0Var.d, 0, gz0Var.f);
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
            gz0Var2 = new gz0(gz0Var.a, gz0Var.b, gz0Var.c, gz0Var.d, Math.max(i, 0), hashMap);
        }
        hz0Var.b(gz0Var2);
    }

    @Override // tz7
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 21:
                tn0 tn0Var = (tn0) obj2;
                tn0 tn0Var2 = (tn0) obj;
                if (i != 1) {
                    if (i != 3) {
                        tn0Var2.a(null);
                        break;
                    }
                } else {
                    tn0Var.a(null);
                    break;
                }
                break;
            default:
                p8c p8cVar = (p8c) obj2;
                p8c p8cVar2 = (p8c) obj;
                if (i != 1) {
                    if (i != 3) {
                        p8cVar2.a(null);
                        break;
                    }
                } else {
                    p8cVar.a(null);
                    break;
                }
                break;
        }
    }

    @Override // dz0
    public final void cancel() {
        yz0 yz0Var = (yz0) this.b;
        yz0Var.b.removeCallbacks((z20) this.c);
    }

    @Override // d39
    public final void e(float f, float f2, int i, View view) {
        org.telegram.ui.o oVar = (org.telegram.ui.o) this.b;
        m mVar = (m) this.c;
        if (oVar.L == null || i - 1 >= 0) {
            fib fibVar = oVar.Q0;
            if (fibVar != null) {
                boolean w = fibVar.w();
                fib fibVar2 = oVar.Q0;
                if (w) {
                    fibVar2.e(false);
                    return;
                }
                fibVar2.e(false);
            }
            dx adapter = mVar.getAdapter();
            if ((view instanceof mw) && adapter.F != null) {
                mw mwVar = (mw) view;
                if (oVar.I0 == 0) {
                    if ((!mwVar.c || f >= view.getMeasuredWidth() / 2) && !mwVar.d) {
                        TLObject a2 = na7.q1(oVar.Y).a2("previews");
                        if (a2 instanceof TLRPC.TL_user) {
                            oVar.N(adapter.F.id, (TLRPC.User) a2);
                            return;
                        }
                        int i2 = y6c.t0;
                        long j = adapter.F.id;
                        oVar.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        oVar.I0 = ConnectionsManager.getInstance(i2).sendRequest(tL_contacts_resolveUsername, new jt(oVar, i2, j));
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
            if (w2 instanceof tw) {
                w2 = ((tw) w2).b;
            }
            if (w2 instanceof TL_iv.pageBlockChannel) {
                na7.q1(oVar.Y).A3(hc2.K(((TL_iv.pageBlockChannel) w2).channel, false), oVar.N, 2, null);
                oVar.l(false, true);
                return;
            }
            if (w2 instanceof zw) {
                zw zwVar = (zw) w2;
                oVar.O(zwVar.a.articles.get(zwVar.b).url, null, null);
                return;
            }
            if (w2 instanceof TL_iv.pageBlockDetails) {
                View v = org.telegram.ui.o.v(view);
                if (v instanceof ou) {
                    oVar.d = null;
                    oVar.f = null;
                    if (adapter.e.indexOf(pageBlock) >= 0) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) w2;
                        pageblockdetails.open = !pageblockdetails.open;
                        int b = adapter.b();
                        adapter.M();
                        int abs = Math.abs(adapter.b() - b);
                        ou ouVar = (ou) v;
                        ouVar.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                        ouVar.invalidate();
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

    @Override // b3c
    public final void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((ss0) this.b).o0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // d39
    public final boolean q(View view) {
        return false;
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j) {
        ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList;
        String str;
        gz0 gz0Var;
        gz0 gz0Var2;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 28:
                zz0 zz0Var = (zz0) obj2;
                vy0 vy0Var = (vy0) obj;
                long j2 = 0;
                if (tLObject instanceof TL_phone.groupCallStreamChannels) {
                    arrayList = ((TL_phone.groupCallStreamChannels) tLObject).channels;
                    if (!arrayList.isEmpty() && arrayList.get(0).last_timestamp_ms > 0) {
                        j2 = arrayList.get(0).last_timestamp_ms + 1000;
                    }
                } else {
                    arrayList = null;
                }
                zz0Var.e.execute(new m77((Object) zz0Var, (Object) arrayList, (Object) vy0Var, j2, (byte) 3));
                break;
            default:
                zz0 zz0Var2 = (zz0) obj2;
                hz0 hz0Var = (hz0) obj;
                if (tLObject instanceof TLRPC.TL_upload_file) {
                    TLRPC.TL_upload_file tL_upload_file = (TLRPC.TL_upload_file) tLObject;
                    NativeByteBuffer nativeByteBuffer = tL_upload_file.bytes;
                    int limit = nativeByteBuffer != null ? nativeByteBuffer.limit() : 0;
                    byte[] bArr = new byte[limit];
                    if (limit > 0) {
                        tL_upload_file.bytes.position(0);
                        tL_upload_file.bytes.readBytes(bArr, false);
                    }
                    gz0Var2 = new gz0(j, bArr, 0, limit);
                } else {
                    if (tLObject instanceof TLRPC.TL_upload_fileCdnRedirect) {
                        gz0Var = new gz0(j, null, 1, 0);
                    } else {
                        if (tL_error == null || (str = tL_error.text) == null) {
                            str = "";
                        }
                        if (str.startsWith("FLOOD_WAIT") || "TIME_TOO_BIG".equals(str)) {
                            gz0Var = new gz0(j, null, 1, 0);
                        } else if ("GROUPCALL_JOIN_MISSING".equals(str)) {
                            gz0Var2 = new gz0(0L, null, 3, 0);
                        } else {
                            gz0Var = new gz0(j, null, 2, 0);
                        }
                    }
                    gz0Var2 = gz0Var;
                }
                zz0Var2.e.execute(new z20(hz0Var, gz0Var2, (byte) 27));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ed
    public final void u(hd hdVar, int i) {
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
                c01 g = hdVar.g(-1, true, true);
                g.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(a1Var.a).sendRequestTyped(deletetone, new hc(objArr2 == true ? 1 : 0), new p((Object) a1Var, (Object) g, (Object) tL_aiComposeTone, (byte) (objArr == true ? 1 : 0)));
                break;
            case 1:
                ((zm) obj2).k(((boolean[]) obj)[0]);
                break;
            case 2:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) obj2;
                LaunchActivity launchActivity = (LaunchActivity) obj;
                i96 F0 = k96.D0().F0(b00.h(tL_langPackLanguage.official ? "remote_" : "unofficial_", tL_langPackLanguage.lang_code));
                if (F0 == null) {
                    F0 = new i96();
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
                k96.D0().c(F0, true, false, false, true, y6c.t0, null);
                launchActivity.y0(true);
                break;
            case 3:
                v82 v82Var = (v82) obj2;
                boolean[] zArr = (boolean[]) obj;
                boolean z = zArr[0];
                boolean z2 = zArr[1];
                cj3 cj3Var = (cj3) v82Var.b;
                ArrayList arrayList = (ArrayList) v82Var.c;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Long l = (Long) arrayList.get(i3);
                    long longValue = l.longValue();
                    if (z) {
                        cj3Var.getMessagesController().r4(longValue, cj3Var.getMessagesController().V1(l), null, null, false);
                    }
                    if (z2) {
                        cj3Var.getMessagesController().T(0, longValue, true);
                    }
                    cj3Var.getMessagesController().t(longValue);
                }
                cj3Var.y3(false);
                break;
            case 4:
                hdVar.dismiss();
                ((x0) obj2).a(((EditText) obj).getText().toString());
                break;
            case 5:
                uc7 uc7Var = (uc7) obj;
                int i4 = ((int[]) obj2)[0];
                if (i4 == 0) {
                    i2 = 900;
                } else if (i4 != 1) {
                    i2 = i4 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                uc7Var.a(i2);
                break;
            case 6:
                ((AtomicBoolean) obj2).set(true);
                ((vs2) obj).accept(Boolean.FALSE);
                break;
            case 7:
                mi miVar = (mi) obj2;
                p8c p8cVar = (p8c) obj;
                String trim = miVar.getText().toString().trim();
                if (TextUtils.isEmpty(trim) ? false : ij.a.matcher(trim.trim()).matches()) {
                    p8cVar.a(trim);
                    hdVar.dismiss();
                    break;
                } else {
                    gl.z3(miVar);
                    break;
                }
            case 8:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) obj2;
                int i5 = encryptedChat.ttl;
                int value = ((hn7) obj).getValue();
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
                    bu9.i(y6c.t0).z(encryptedChat, null);
                    ad7 Y = ad7.Y(y6c.t0);
                    Y.a.c(new fb7(Y, encryptedChat, objArr3 == true ? 1 : 0));
                    break;
                }
                break;
            case 9:
                SharedPreferences.Editor edit = na7.q1(y6c.t0).W3.edit();
                edit.remove("color_" + ((String) obj2));
                edit.commit();
                ((Runnable) obj).run();
                break;
            case 10:
                ((sc7) obj2).k(((boolean[]) obj)[0]);
                break;
            case 11:
                ((SharedPreferences) obj2).edit().putBoolean("proxycheckstatusip", true).apply();
                ((nn6) obj).run();
                break;
            case 12:
            case 13:
            case 14:
            case 17:
            case 21:
            case 22:
            case 23:
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
                ty tyVar = (ty) obj2;
                py pyVar = (py) obj;
                try {
                    int parseInt = Integer.parseInt(pyVar.getText().toString().trim());
                    tyVar.b1(parseInt);
                    tyVar.X1.setValue(parseInt);
                    hdVar.dismiss();
                    break;
                } catch (Throwable th) {
                    gl.z3(pyVar);
                    fa4.g(th, true);
                    return;
                }
            case 16:
                hdVar.dismiss();
                ((v60) obj2).a0((View) obj, true);
                break;
            case 18:
                ((dm0) obj2).i0((HashSet) obj);
                break;
            case 19:
                ((AtomicBoolean) obj2).set(true);
                ((uy9) obj).run();
                break;
            case 20:
                ((tn0) obj2).a((TLRPC.TL_premiumGiftCodeOption) obj);
                break;
            case 24:
                hv0 hv0Var = (hv0) obj2;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = na7.q1(hv0Var.N).o1(hv0Var.V);
                ConnectionsManager.getInstance(hv0Var.N).sendRequest(allowsendmessage, new en0((Object) hv0Var, obj, (Object) hdVar, (byte) 8));
                break;
        }
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public final void run(long j) {
        gl.c3(new de2(this.b, j, this.c, (byte) 10));
    }
}

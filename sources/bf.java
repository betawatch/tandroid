// default package

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bf implements fd, ot2, ncc, ui7, lcc, is6, sgb, NativeInstance.PayloadCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bf(int i, Context context, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.a = (byte) 18;
        this.b = i;
        this.c = context;
        this.d = tL_messages_stickerSet;
    }

    @Override // ui7
    public final void a(Canvas canvas) {
        gl9 gl9Var = (gl9) this.c;
        View view = (View) this.d;
        AtomicReference atomicReference = gl9Var.E;
        StaticLayout staticLayout = gl9Var.b;
        ArrayList arrayList = gl9Var.x;
        npa.g(view, false, this.b, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        xpa.a(canvas, gl9Var.b);
        hm.drawAnimatedEmojis(canvas, gl9Var.b, gl9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // ot2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        gaa gaaVar;
        yx6 yx6Var = (yx6) this.c;
        xw6 xw6Var = (xw6) this.d;
        try {
            gaaVar = (gaa) ((x76) obj).get();
            yve.l(gaaVar, "SessionResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            efd.g("MediaSessionStub", "Session operation failed", e);
            gaaVar = new gaa(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        } catch (CancellationException e2) {
            efd.g("MediaSessionStub", "Session operation cancelled", e2);
            gaaVar = new gaa(1);
        } catch (ExecutionException e3) {
            e = e3;
            efd.g("MediaSessionStub", "Session operation failed", e);
            gaaVar = new gaa(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        }
        sz6.W(yx6Var, xw6Var, this.b, gaaVar);
    }

    @Override // is6
    public final void b(String str, ArrayList arrayList) {
        y4b y4bVar = (y4b) this.c;
        HashMap hashMap = (HashMap) this.d;
        z4b z4bVar = y4bVar.a;
        int i = z4bVar.Q;
        HashMap hashMap2 = z4bVar.J;
        if (this.b == i) {
            int size = arrayList.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = ((hs6) arrayList.get(i2)).a;
                ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    y4bVar.a();
                    if (!hashMap2.containsKey(arrayList2)) {
                        hashMap2.put(arrayList2, str2);
                        z4bVar.K.add(arrayList2);
                        z = true;
                    }
                }
            }
            if (z) {
                z4bVar.f();
            }
        }
    }

    @Override // sgb
    public final Object g() {
        ba0 ba0Var = (ba0) this.c;
        ((pm3) ba0Var.d).E((ta0) this.d, this.b + 1, false);
        return null;
    }

    @Override // lcc
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        Context context = (Context) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        int i = this.b;
        String V = r47.V(document, "😀", Integer.valueOf(i));
        String str = TextUtils.isEmpty(V) ? "😀" : V;
        id idVar = new id(3, null, context);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = ls6.b0(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = ls6.c0(document, str);
        ConnectionsManager.getInstance(yac.t0).sendRequest(tL_stickers_addStickerToSet, new eu0((Object) idVar, i, (Object) document, obj, (Object) tL_stickers_addStickerToSet, (byte) 13));
        try {
            idVar.q(350L);
        } catch (Exception unused) {
        }
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        lm7 lm7Var = (lm7) this.c;
        jm7 jm7Var = (jm7) this.d;
        b8c b8cVar = (b8c) obj;
        View view = (View) obj2;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        Object obj3 = b8cVar.H;
        boolean z = obj3 instanceof r47;
        int i = this.b;
        int i2 = -1;
        if (!z) {
            int i3 = b8cVar.d;
            if (i3 == -1) {
                lm7Var.w0(i, jm7Var.q);
                return;
            } else {
                if (i3 == -2) {
                    lm7Var.u0();
                    return;
                }
                return;
            }
        }
        r47 r47Var = (r47) obj3;
        v94 v94Var = view instanceof v94 ? (v94) view : null;
        if (v94Var != null) {
            float floatValue = f.floatValue();
            float floatValue2 = f2.floatValue();
            HorizontalScrollView horizontalScrollView = v94Var.y;
            if (v94Var.R >= 1.0f && horizontalScrollView.getVisibility() == 0 && floatValue2 >= horizontalScrollView.getTop() && floatValue2 <= horizontalScrollView.getBottom()) {
                float scrollX = (floatValue + horizontalScrollView.getScrollX()) - v94.g();
                int i4 = 0;
                while (true) {
                    int[] iArr = v94Var.d0;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    if (scrollX >= iArr[i4] && scrollX <= r10 + v94Var.e0[i4]) {
                        i2 = i4;
                        break;
                    }
                    i4++;
                }
            }
        }
        int i5 = i2;
        if (i5 >= 0) {
            ArrayList arrayList = new ArrayList(v94Var.getMedia());
            if (i5 >= arrayList.size() || lm7Var.getParentActivity() == null) {
                return;
            }
            String f3 = ea4.f((r47) arrayList.get(i5));
            r47 message = v94Var.getMessage();
            ha4 m0 = f3 != null ? lm7Var.m0(i, message, "open_media", f3) : null;
            r47 r47Var2 = (r47) arrayList.get(0);
            PhotoViewer.q0().T1(null, lm7Var, null);
            if (!PhotoViewer.q0().n1(arrayList, i5, r47.B0(r47Var2.k), 0L, 0L, new bm7(i, message, lm7Var)) || m0 == null) {
                return;
            }
            lm7Var.g0(m0, true, null);
            return;
        }
        if (v94Var != null && v94Var.R > 0.5f && v94Var.L && v94Var.a0 > v94Var.b0 && v94Var.S < 1.0f) {
            String z0 = lm7.z0(i, r47Var);
            HashMap hashMap = lm7Var.W;
            km7 km7Var = (km7) hashMap.get(z0);
            if (km7Var == null || km7Var.b < 1.0f) {
                lm7Var.D0(lm7Var.m0(i, r47Var, "expand", null));
            }
            if (km7Var == null) {
                km7Var = new km7(lm7Var, 0.0f, 0.0f);
                hashMap.put(z0, km7Var);
            }
            km7Var.a(1.0f);
            return;
        }
        Bundle bundle = new Bundle();
        long B0 = r47.B0(r47Var.k);
        bundle.putLong(B0 < 0 ? "chat_id" : "user_id", Math.abs(B0));
        bundle.putInt("message_id", r47Var.e1());
        bundle.putBoolean("from_news", true);
        bundle.putBoolean("for_news", true);
        if (lm7Var.getMessagesController().C(bundle, lm7Var, null, null)) {
            zu1 zu1Var = new zu1(bundle);
            zu1Var.tb = r47Var;
            lm7Var.a0.b();
            lm7Var.B0(zu1Var, i, r47Var);
            lm7Var.presentFragment(zu1Var);
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public final void run(int i, String str) {
        ((VoIPService) this.c).lambda$createGroupInstance$70(this.b, (boolean[]) this.d, i, str);
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ij ijVar = (ij) obj2;
                if7 if7Var = (if7) obj;
                String trim = ijVar.getText().toString().trim();
                if (trim.length() <= i2 && !trim.isEmpty()) {
                    if7Var.a(trim);
                    idVar.dismiss();
                    break;
                } else {
                    hl.z3(ijVar);
                    break;
                }
                break;
            case 1:
                k41 k41Var = (k41) obj2;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj;
                String obj3 = k41Var.getText().toString();
                if (obj3.length() <= 32) {
                    r41 d = r41.d(i2);
                    TL_account.TL_businessChatLink c = d.c(tL_businessChatLink.link);
                    if (c != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c.message;
                        tL_inputBusinessChatLink.entities = c.entities;
                        tL_inputBusinessChatLink.title = obj3;
                        d.b(c, tL_inputBusinessChatLink, null);
                    }
                    idVar.dismiss();
                    break;
                } else {
                    hl.z3(k41Var);
                    break;
                }
            case 2:
                zu1 zu1Var = (zu1) obj2;
                zu1Var.getMessagesController().L3(zu1Var.e, zu1Var.f, this.b, false, !r4[1], ((boolean[]) obj)[0]);
                v21 B = d31.B(zu1Var, true, null, null, zu1Var.Ba);
                B.j();
                z11 z11Var = B.e;
                z11Var.postDelayed(new j11(z11Var, (byte) 2), 550L);
                break;
            case 3:
                ((zu1) obj2).D9(i2, (r47) obj);
                break;
            case 4:
            case 5:
            case 9:
            case 10:
            case 13:
            case 14:
            default:
                ((StickersActivity) obj2).j0(i2, (ArrayList) obj);
                break;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                j95 j95Var = ((h85) obj2).r1.b;
                j95Var.T2.C(i2, editTextBoldCursor.getText().toString());
                hl.t1(editTextBoldCursor);
                j95Var.d1().j(i2 == 0 ? 39 : 100, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    break;
                }
                break;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                HashMap hashMap = (HashMap) obj;
                String str = LaunchActivity.C1;
                ArrayList arrayList = launchActivity.e0;
                if (!arrayList.isEmpty() && hl.H1((e) c00.g(1, arrayList))) {
                    uc6 uc6Var = new uc6(0);
                    uc6Var.M0 = new wg((Object) hashMap, i2, (byte) 9);
                    launchActivity.t0(uc6Var);
                    break;
                }
                break;
            case 8:
                ((uc6) obj2).I0(900, i2, (TLRPC.User) obj);
                break;
            case 11:
                uqc.L0(i2, (vnb) obj, (Context) obj2);
                break;
            case 12:
                ((PasscodeActivity) obj2).q0((hq7) obj, i2);
                break;
            case 15:
                iw9 iw9Var = (iw9) obj2;
                TLRPC.Reaction reaction = (TLRPC.Reaction) obj;
                String obj4 = iw9Var.getText().toString();
                if (obj4.length() <= 12) {
                    uc7.s1(i2).w4(w49.d(reaction), obj4);
                    idVar.dismiss();
                    break;
                } else {
                    hl.z3(iw9Var);
                    break;
                }
            case 16:
                ((SessionsActivity) obj2).j0(i2, (boolean[]) obj);
                break;
        }
    }

    public /* synthetic */ bf(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ bf(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}

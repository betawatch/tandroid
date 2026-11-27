// default package

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bf7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bf7(ex exVar, int i, int[] iArr, int[] iArr2) {
        this.a = (byte) 6;
        this.c = exVar;
        this.b = i;
        this.d = iArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = 5;
        byte b2 = 9;
        UndoView undoView = null;
        switch (this.a) {
            case 0:
                kf7 kf7Var = (kf7) this.c;
                int i = this.b;
                TLRPC.Message message = (TLRPC.Message) this.d;
                try {
                    long j = message.id;
                    if (r47.a4(message)) {
                        i = 5;
                    } else if (r47.c5(message)) {
                        i = 9;
                    }
                    SQLiteDatabase sQLiteDatabase = kf7Var.b;
                    if (i == 9) {
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE welcome_messages SET send_state = 2 WHERE mid = " + j + " AND dialog_id = " + r47.B0(message)).stepThis().dispose();
                        break;
                    } else if (i == 5) {
                        Locale locale2 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE quick_replies_messages SET send_state = 2 WHERE mid = " + j + " AND topic_id = " + r47.H1(kf7Var.currentAccount, message)).stepThis().dispose();
                        break;
                    } else if (i == 1) {
                        Locale locale3 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE scheduled_messages_v2 SET send_state = 2 WHERE mid = " + j + " AND uid = " + r47.B0(message)).stepThis().dispose();
                        break;
                    } else {
                        Locale locale4 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE messages_v2 SET send_state = 2 WHERE mid = " + j + " AND uid = " + r47.B0(message)).stepThis().dispose();
                        kf7Var.b.executeFast("UPDATE messages_topics SET send_state = 2 WHERE mid = " + j + " AND uid = " + r47.B0(message)).stepThis().dispose();
                        break;
                    }
                } catch (Exception e) {
                    kf7Var.p(e, true);
                    return;
                }
            case 1:
                int i2 = this.b;
                Context context = (Context) this.c;
                nx0[] nx0VarArr = (nx0[]) this.d;
                String str = uc7.s1(i2).l4.h3.f;
                if (!str.startsWith("http://") && !str.startsWith("https://")) {
                    str = "https://".concat(str);
                }
                m01.u(context, str);
                nx0VarArr[0].dismiss();
                break;
            case 2:
                int[] iArr = (int[]) this.c;
                int i3 = this.b;
                o97 o97Var = (o97) this.d;
                iArr[0] = i3;
                o97Var.run();
                break;
            case 3:
                o oVar = (o) this.c;
                String str2 = (String) this.d;
                int i4 = this.b;
                HashMap hashMap = new HashMap(oVar.v0[0].c.x);
                ArrayList arrayList = new ArrayList(oVar.v0[0].c.y);
                oVar.X0 = null;
                Utilities.g.c(new l77((Object) oVar, (Object) arrayList, (Object) hashMap, (Object) str2, i4, (byte) 4));
                break;
            case 4:
                int i5 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                uc7.s1(i5).j4(tL_chatInviteJoinResultWebView.users, false);
                bq0.b(i5).c(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            case 5:
                o oVar2 = (o) this.c;
                int i6 = this.b;
                wt wtVar = (wt) this.d;
                if (oVar2.J0 == i6 && oVar2.H0 != 0) {
                    ConnectionsManager.getInstance(oVar2.Y).cancelRequest(oVar2.H0, false);
                    oVar2.H0 = 0;
                }
                if (oVar2.O0 == wtVar) {
                    oVar2.O0 = null;
                    break;
                }
                break;
            case 6:
                ex exVar = (ex) this.c;
                int i7 = this.b;
                int[] iArr2 = (int[]) this.d;
                exVar.L = i7;
                exVar.K = iArr2;
                exVar.N.d0();
                break;
            case 7:
                int[] iArr3 = (int[]) this.c;
                int i8 = this.b;
                fn7[] fn7VarArr = (fn7[]) this.d;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i8).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
                if (fn7VarArr[0] != null) {
                    jn7.f(i8).n(fn7VarArr[0], 60);
                    fn7VarArr[0] = null;
                    break;
                }
                break;
            case 8:
                r41 r41Var = (r41) this.c;
                r41Var.b.add(this.b, (TL_account.TL_businessChatLink) this.d);
                jn7.f(r41Var.a).k(jn7.J1, new Object[0]);
                break;
            case 9:
                String str3 = (String) this.c;
                int i9 = this.b;
                nx0[] nx0VarArr2 = (nx0[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse(str3);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                xkc.g(LaunchActivity.H1, i9, tL_inputGroupCallSlug, false, null, null);
                nx0VarArr2[0].dismiss();
                break;
            case 10:
                ((CameraView) this.c).lambda$createCamera$11(this.b, (SurfaceTexture) this.d);
                break;
            case 11:
                ((CameraView) this.c).lambda$createCamera$10((CameraView.CameraGLThread) this.d, this.b);
                break;
            case 12:
                zu1 zu1Var = (zu1) this.c;
                int i10 = this.b;
                qy qyVar = (qy) this.d;
                zu1Var.A0.y0(0, i10, null);
                if (!hl.E3(qyVar)) {
                    qyVar.clearFocus();
                    qyVar.requestFocus();
                }
                hl.d3(new lo1(qyVar, null == true ? 1 : 0), 100L);
                break;
            case 13:
                dt1 dt1Var = (dt1) this.c;
                dl1 dl1Var = (dl1) this.d;
                int i11 = this.b;
                r47 messageObject = dl1Var.getMessageObject();
                zu1 zu1Var2 = dt1Var.a.R;
                zu1Var2.J(i11, messageObject.e1(), r47.B0(messageObject.k) == zu1Var2.d7 ? 1 : 0, 0, true, true);
                break;
            case 14:
                j22 j22Var = (j22) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i12 = this.b;
                if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                    j22Var.y = tL_webViewResultUrl.query_id;
                    j22Var.n.q(i12, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    hl.c3(j22Var.V);
                    break;
                }
                break;
            case 15:
                uqc.L0(this.b, (vnb) this.d, ((h42) this.c).getContext());
                break;
            case 16:
                a72 a72Var = (a72) this.c;
                int i13 = this.b;
                View view = (View) this.d;
                a72Var.W = 0;
                a72Var.V = i13;
                if (view instanceof skb) {
                    a72Var.T((skb) view, true);
                    break;
                } else {
                    a72Var.r.g(a72Var.J0);
                    break;
                }
            case 17:
                t82 t82Var = (t82) this.c;
                hm hmVar = (hm) this.d;
                int i14 = this.b;
                Editable text = t82Var.h.getText();
                int spanStart = text.getSpanStart(hmVar);
                int spanEnd = text.getSpanEnd(hmVar);
                int i15 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    t82Var.h.getText().delete(spanStart, spanEnd);
                    q82 q82Var = t82Var.h;
                    q82Var.setSelection(Math.min(i14 - i15, q82Var.getText().length()));
                    break;
                }
                break;
            case 18:
                vi3 vi3Var = (vi3) this.c;
                int i16 = this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                uj3 uj3Var = vi3Var.k0;
                ArrayList arrayList2 = uj3Var.T1;
                if (arrayList2 != null && i16 >= 0 && i16 < arrayList2.size()) {
                    uj3Var.T1.add(i16, dialog);
                    uj3Var.f0[0].b(true);
                    break;
                }
                break;
            case 19:
                sj3 sj3Var = (sj3) this.c;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.d;
                int i17 = this.b;
                tj3 tj3Var = sj3Var.h;
                uj3 uj3Var2 = sj3Var.i;
                uj3Var2.U1 = true;
                uj3Var2.getMessagesController().b(0, i17, dialog2.id);
                uj3Var2.U1 = false;
                ArrayList W0 = uj3Var2.getMessagesController().W0(0);
                int indexOf = W0.indexOf(dialog2);
                if (indexOf >= 0) {
                    ArrayList W02 = uj3Var2.getMessagesController().W0(1);
                    if (!W02.isEmpty() || indexOf != 1) {
                        uj3Var2.U4(true, true);
                        tj3Var.y.D();
                        tj3Var.b(true);
                        uj3Var2.I2();
                    }
                    if (W02.isEmpty()) {
                        W0.remove(0);
                        if (indexOf == 1) {
                            uj3Var2.U4(true, true);
                            tj3Var.b(true);
                            uj3Var2.I2();
                            break;
                        } else {
                            if (!uj3Var2.T1.isEmpty()) {
                                uj3Var2.T1.remove(0);
                            }
                            tj3Var.y.D();
                            tj3Var.b(true);
                            break;
                        }
                    }
                } else {
                    tj3Var.b(false);
                    break;
                }
                break;
            case 20:
                gx9 gx9Var = (gx9) this.c;
                int i18 = this.b;
                String str4 = (String) this.d;
                int i19 = gx9Var.t0;
                gx9Var.r = null;
                if (i18 == gx9Var.e0) {
                    if (gx9Var.n >= 0) {
                        ConnectionsManager.getInstance(i19).cancelRequest(gx9Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 1;
                    tL_channels_searchPosts.hashtag = str4;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    gx9Var.n = ConnectionsManager.getInstance(i19).sendRequest(tL_channels_searchPosts, new hb7((Object) gx9Var, i18, (Object) str4, (byte) 4));
                    break;
                }
                break;
            case 21:
                int i20 = this.b;
                int[] iArr4 = (int[]) this.c;
                on3 on3Var = (on3) this.d;
                jn7 f = jn7.f(i20);
                for (int i21 : iArr4) {
                    f.n(on3Var, i21);
                }
                break;
            case 22:
                lq3 lq3Var = (lq3) this.c;
                r47 r47Var = (r47) this.d;
                int i22 = this.b;
                ArrayList arrayList3 = lq3Var.H;
                TLRPC.Document F0 = r47Var.F0();
                for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                    TLRPC.Document F02 = ((r47) arrayList3.get(i23)).F0();
                    if (F02 == null || (F0 != null && F02.id == F0.id)) {
                        arrayList3.remove(i23);
                        lq3Var.getNotificationCenter().k(jn7.e5, new Object[0]);
                        if (i22 == 0) {
                            jn7.e().k(jn7.S4, 1, ob6.a0("MessageNotFound", null, 2131748306, new Object[0]));
                            break;
                        } else if (i22 == -1) {
                            LaunchActivity.F(2);
                            break;
                        }
                    }
                }
                break;
            case 23:
                ay3 ay3Var = (ay3) this.c;
                zh6 zh6Var = (zh6) this.d;
                int i24 = this.b;
                e eVar = ay3Var.U2.m1;
                if (eVar instanceof zu1) {
                    zu1 zu1Var3 = (zu1) eVar;
                    zu1Var3.i6();
                    undoView = zu1Var3.N3;
                } else if (eVar instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) eVar).M;
                }
                UndoView undoView2 = undoView;
                if (undoView2 != null) {
                    if (zh6Var.m() == 1) {
                        undoView2.m(((TLRPC.Dialog) zh6Var.n(0)).id, Integer.valueOf(i24), 53);
                        break;
                    } else {
                        undoView2.k(0L, 53, Integer.valueOf(i24), Integer.valueOf(zh6Var.m()), null, null);
                        break;
                    }
                }
                break;
            case 24:
                l14 l14Var = (l14) this.c;
                id[] idVarArr = (id[]) this.d;
                int i25 = this.b;
                id idVar = idVarArr[0];
                if (idVar != null) {
                    idVar.setOnCancelListener(new gt0(l14Var, i25, b));
                    idVarArr[0].show();
                    break;
                }
                break;
            case 25:
                ((FfmpegAudioWaveformLoader) this.c).lambda$new$0((String) this.d, this.b);
                break;
            case 26:
                ((FfmpegAudioWaveformLoader) this.c).lambda$receiveChunk$1((short[]) this.d, this.b);
                break;
            case 27:
                int i26 = this.b;
                e eVar2 = (e) this.c;
                pcc pccVar = (pcc) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i26;
                eVar2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new hb7((Object) eVar2, i26, (Object) pccVar, (byte) 7));
                break;
            case 28:
                ((View) this.d).postOnAnimation(new hl3((j14) this.c, this.b, b2));
                break;
            default:
                s35 s35Var = (s35) this.c;
                ryc rycVar = (ryc) this.d;
                int i27 = this.b;
                t35 t35Var = s35Var.c;
                if (t35Var.c(rycVar, i27)) {
                    t35Var.f("invalid streaming JSON");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ bf7(int i, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ bf7(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ bf7(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}

// default package

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ls5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ls5(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x02d0, code lost:
    
        if (r10 != 16) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02db, code lost:
    
        if (r10 != 3) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e7, code lost:
    
        if (r10 == 16) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a1, code lost:
    
        if (r0 != 16) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ac, code lost:
    
        if (r0 != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b8, code lost:
    
        if (r0 == 16) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ed  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        ActionBarLayout actionBarLayout;
        TLRPC.UserFull userFull;
        byte b;
        int i2;
        byte b2;
        byte b3;
        byte b4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte b5 = 11;
        byte b6 = 0;
        switch (this.a) {
            case 0:
                bt5 bt5Var = (bt5) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                e eVar = (e) this.d;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                eVar.presentFragment(new ProfileActivity(bundle, null));
                bt5Var.f2 = true;
                break;
            case 1:
                vs5 vs5Var = (vs5) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                ws5 ws5Var = vs5Var.a;
                if (tL_error == null) {
                    boolean z = tLObject instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                    bt5 bt5Var2 = ws5Var.c;
                    if (!z) {
                        TLRPC.ChatFull chatFull = bt5Var2.n1;
                        if (chatFull != null) {
                            int i8 = chatFull.invitesCount - 1;
                            chatFull.invitesCount = i8;
                            if (i8 < 0) {
                                chatFull.invitesCount = 0;
                            }
                            kf7.a0(bt5Var2.a).x1(bt5Var2.n1.invitesCount, bt5Var2.a2);
                        }
                        lf1 lf1Var = bt5Var2.d2;
                        if (lf1Var != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = bt5Var2.l1;
                            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                            wf1 wf1Var = lf1Var.a;
                            ArrayList arrayList = wf1Var.p0;
                            int size = arrayList.size();
                            tL_chatInviteExported.revoked = true;
                            TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                            tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported;
                            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                            tL_channelAdminLogEvent.user_id = yac.h(wf1Var.getAccountInstance().a).n;
                            i = ((e) wf1Var).currentAccount;
                            if (new r47(i, tL_channelAdminLogEvent, wf1Var.o0, wf1Var.n0, wf1Var.f, wf1Var.U, true).U >= 0) {
                                wf1Var.O0();
                                int size2 = arrayList.size() - size;
                                if (size2 > 0) {
                                    wf1Var.D0.N = true;
                                    tf1 tf1Var = wf1Var.F;
                                    tf1Var.p(tf1Var.h, size2);
                                    wf1Var.Y0();
                                }
                                wf1Var.z0.remove(tL_chatInviteExported.link);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject;
                        TLRPC.ChatFull chatFull2 = bt5Var2.n1;
                        if (chatFull2 != null) {
                            chatFull2.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (bt5Var2.d2 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull2.exported_invite;
                            break;
                        }
                    }
                }
                break;
            case 2:
                lt5 lt5Var = (lt5) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error2 == null) {
                    lt5Var.t2 = (TLRPC.TL_chatInviteExported) tLObject2;
                    TLRPC.ChatFull N0 = uc7.s1(lt5Var.a).N0(lt5Var.p2);
                    if (N0 != null) {
                        N0.exported_invite = lt5Var.t2;
                    }
                    if (lt5Var.t2.link != null) {
                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", lt5Var.t2.link));
                        d31.j(lt5Var.k2).j();
                        lt5Var.dismiss();
                    }
                }
                lt5Var.s2 = false;
                break;
            case 3:
                ht5 ht5Var = (ht5) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                ht5Var.h = null;
                ht5Var.c = arrayList2;
                ht5Var.d = arrayList3;
                sv9 sv9Var = ht5Var.e;
                sv9Var.f(arrayList2, null);
                lt5 lt5Var2 = ht5Var.n;
                lt5Var2.K0(ht5Var.f - 1);
                ht5Var.f();
                if (!sv9Var.e() && ht5Var.b() <= 2) {
                    lt5Var2.t1.e(false, true);
                    break;
                }
                break;
            case 4:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                zu1 zu1Var = (zu1) this.d;
                TLRPC.User user2 = (TLRPC.User) this.c;
                String str = LaunchActivity.C1;
                if (tL_error3 == null) {
                    if (user2 != null && !lbc.D(user2)) {
                        c00.v(ob6.a0(null, null, 2131747915, lbc.k(user2, true)), d31.b0(zu1Var), R.raw.contact_check, 36);
                        break;
                    }
                } else {
                    d31.b0(zu1Var).g0(tL_error3, false);
                    break;
                }
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                tg5 tg5Var = (tg5) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                String str2 = LaunchActivity.C1;
                try {
                    tg5Var.run();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                if (tLObject3 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject3;
                    jj.u0(launchActivity, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 6:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                znb znbVar = (znb) this.d;
                String str3 = LaunchActivity.C1;
                if (!(tLObject4 instanceof TLRPC.TL_wallPaper)) {
                    launchActivity2.i0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject4;
                    launchActivity2.S0 = znbVar;
                    launchActivity2.Q0 = xb4.r(null, tL_wallPaper.document);
                    launchActivity2.R0 = tL_wallPaper;
                    xb4.G(znbVar.F).X(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 7:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                tg5 tg5Var2 = (tg5) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                String str4 = LaunchActivity.C1;
                try {
                    tg5Var2.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error4.text)) {
                        jj.u0(launchActivity3, ob6.M0(2131743475, null), true);
                    } else {
                        launchActivity3.F0(jj.K(launchActivity3, null, ob6.M0(2131751070, null) + "\n" + tL_error4.text));
                    }
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 8:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                int[] iArr = (int[]) this.c;
                long[] jArr = (long[]) this.d;
                String str5 = LaunchActivity.C1;
                int i9 = iArr[0] - 1;
                iArr[0] = i9;
                if (i9 == 0) {
                    jn7.f(launchActivity4.P).k(jn7.y5, new Object[0]);
                    launchActivity4.p0(jArr, false);
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                znb znbVar2 = (znb) this.c;
                File file = (File) this.d;
                String str6 = LaunchActivity.C1;
                znbVar2.b(file, znbVar2.c);
                hl.c3(new sz5(launchActivity5, b5));
                break;
            case 10:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                TLRPC.User user3 = (TLRPC.User) this.c;
                j16 j16Var = (j16) this.d;
                String str7 = LaunchActivity.C1;
                uc7.s1(launchActivity6.P).i4(user3, true, false);
                j16Var.a(user3);
                break;
            case 11:
                ak akVar = (ak) this.b;
                String str8 = (String) this.c;
                String str9 = (String) this.d;
                LaunchActivity launchActivity7 = (LaunchActivity) akVar.b;
                String str10 = LaunchActivity.C1;
                if (!"rebuild".equals(str8)) {
                    if (!"keys".equals(str8)) {
                        SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                        String str11 = "Blue";
                        String string = sharedPreferences.getString("lastDayTheme", "Blue");
                        if (aob.O0(string) != null && !aob.O0(string).o()) {
                            str11 = string;
                        }
                        String str12 = "Dark Blue";
                        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                        if (aob.O0(string2) != null && aob.O0(string2).o()) {
                            str12 = string2;
                        }
                        boolean z2 = "night".equals(str8) || !("day".equals(str8) || aob.I.o());
                        if (z2) {
                            str11 = str12;
                        }
                        znb O0 = aob.O0(str11);
                        StringBuilder sb = new StringBuilder("DEBUG_THEME ");
                        sb.append(z2 ? "night" : "day");
                        sb.append(" (");
                        sb.append(O0.k());
                        sb.append("), style ");
                        sb.append(str9);
                        Log.i("tmessages", sb.toString());
                        if (!"instant".equals(str9)) {
                            if (!"fade".equals(str9)) {
                                jn7.e().k(jn7.w4, O0, Boolean.FALSE, new int[]{launchActivity7.y0.getMeasuredWidth() / 2, launchActivity7.y0.getMeasuredHeight() / 2}, -1, Boolean.valueOf(z2), null);
                                break;
                            } else {
                                aob.I1(O0, false, -1, null);
                                break;
                            }
                        } else {
                            jn7.e().k(jn7.w4, O0, Boolean.FALSE, null, -1);
                            break;
                        }
                    } else {
                        HashSet r = yob.r();
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = r.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            if (sb2.length() > 0) {
                                sb2.append(',');
                            }
                            sb2.append(d0f.c(intValue));
                        }
                        Log.i("tmessages", "DEBUG_THEME keys on screen (" + r.size() + "): " + ((Object) sb2));
                        break;
                    }
                } else {
                    try {
                        launchActivity7.y0(true);
                        if (hl.O1() && (actionBarLayout = launchActivity7.r0) != null) {
                            actionBarLayout.W(true, true);
                        }
                        Log.i("tmessages", "DEBUG_THEME rebuilt fragment views");
                        break;
                    } catch (Exception e3) {
                        cc4.g(e3, true);
                        return;
                    }
                }
                break;
            case 12:
                e66 e66Var = (e66) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                String str13 = (String) this.d;
                e66Var.c();
                if (tLObject5 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject5;
                    if (!TwoStepVerificationActivity.a0(password, false)) {
                        jj.u0(e66Var.a, ob6.M0(2131743475, null), true);
                    }
                    w56 w56Var = new w56(e66Var, str13, (byte) 2);
                    if (!password.has_password) {
                        o7c o7cVar = new o7c(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        o7cVar.k0 = w56Var;
                        e66Var.u(o7cVar, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.J = password;
                        twoStepVerificationActivity.K = false;
                        e66Var.u(twoStepVerificationActivity, false);
                        w56Var.run();
                        break;
                    }
                }
                break;
            case 13:
                b66 b66Var = (b66) this.b;
                TLObject tLObject6 = (TLObject) this.d;
                TLRPC.User user4 = (TLRPC.User) this.c;
                if (tLObject6 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject6;
                    b66Var.getMessagesController().j4(tL_users_userFull.users, false);
                    b66Var.getMessagesController().c4(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                xkc.m(user4, false, userFull != null && userFull.video_calls_available, b66Var.getParentActivity(), userFull, b66Var.getAccountInstance());
                break;
            case 14:
                p66 p66Var = (p66) this.b;
                q66 q66Var = (q66) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                o66 o66Var = p66Var.h;
                if (o66Var != null && p66Var.e == q66Var) {
                    o66Var.a(clickableSpan);
                    p66Var.e = null;
                    p66Var.b.e(true);
                    break;
                }
                break;
            case 15:
                w96 w96Var = (w96) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                int i10 = w96Var.e;
                if (!w96Var.w) {
                    if (tLObject7 instanceof TL_phone.groupCall) {
                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject7;
                        uc7.s1(i10).j4(groupcall.users, false);
                        uc7.s1(i10).c4(groupcall.chats, false);
                        w96Var.s = groupcall.call;
                        jn7.f(i10).k(jn7.G2, Long.valueOf(w96Var.s.id));
                    } else if (tL_error5 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error5.text)) {
                        hl.c3(new u96(w96Var, (byte) 4));
                    }
                    if (w96Var.I) {
                        Runnable runnable = w96Var.K;
                        if (runnable != null) {
                            hl.r(runnable);
                        }
                        u96 u96Var = new u96(w96Var, (byte) 5);
                        w96Var.K = u96Var;
                        hl.d3(u96Var, w96Var.o() ? 5000 : 20000);
                        break;
                    }
                }
                break;
            case 16:
                int[] iArr2 = (int[]) this.b;
                int[] iArr3 = (int[]) this.c;
                Runnable runnable2 = (Runnable) this.d;
                int i11 = iArr2[0] + 1;
                iArr2[0] = i11;
                if (i11 >= iArr3[0] && runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 17:
                uc6 uc6Var = (uc6) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.d;
                ImageView imageView = new ImageView(uc6Var.getParentActivity());
                imageView.setImageBitmap(bitmap);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e4) {
                    cc4.g(e4, true);
                }
                hl.d3(new ls5((Object) uc6Var, (Object) viewGroup, (Object) gLSurfaceView, (byte) 18), 100L);
                break;
            case 18:
                uc6 uc6Var2 = (uc6) this.b;
                try {
                    ((ViewGroup) this.c).removeView((GLSurfaceView) this.d);
                } catch (Exception e5) {
                    cc4.g(e5, true);
                }
                uc6Var2.J = true;
                uc6Var2.finishFragment();
                break;
            case 19:
                uc6 uc6Var3 = (uc6) this.b;
                id[] idVarArr = (id[]) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                try {
                    idVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                idVarArr[0] = null;
                uc6Var3.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                uc6Var3.finishFragment();
                break;
            case 20:
                id6 id6Var = (id6) this.b;
                hd6 hd6Var = (hd6) this.c;
                hd6 hd6Var2 = (hd6) this.d;
                ArrayList arrayList4 = id6Var.J;
                if (hd6Var != null) {
                    arrayList4.remove(hd6Var);
                }
                arrayList4.add(hd6Var2);
                id6Var.K.k(hd6Var2.a, hd6Var2);
                id6.q();
                jn7.e().k(jn7.G4, new Object[0]);
                break;
            case 21:
                ((qh6) this.b).F1((String) this.c, (TLRPC.auth_SentCode) this.d);
                break;
            case 22:
                ((qh6) this.b).q1((Bundle) this.c, (TLRPC.auth_SentCode) ((TLObject) this.d), true);
                break;
            case 23:
                ry ryVar = (ry) this.b;
                EditText editText = (EditText) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                editText.removeTextChangedListener(ryVar);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 24:
                df6 df6Var = (df6) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                Bundle bundle2 = (Bundle) this.d;
                qh6 qh6Var = df6Var.a0;
                if (!(tLObject8 instanceof TL_account.TL_emailVerified) || qh6Var.G != 3) {
                    if (!(tLObject8 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject8 instanceof TLRPC.TL_auth_authorization) {
                            qh6Var.C1((TLRPC.TL_auth_authorization) tLObject8, false);
                            break;
                        }
                    } else {
                        qh6Var.q1(bundle2, ((TL_account.TL_emailVerifiedLogin) tLObject8).sent_code, true);
                        break;
                    }
                } else {
                    qh6Var.finishFragment();
                    qh6Var.e0.run();
                    break;
                }
                break;
            case 25:
                cg6 cg6Var = (cg6) this.b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.FileLocation fileLocation = photoSize.location;
                cg6Var.O = fileLocation;
                cg6Var.P = photoSize2.location;
                cg6Var.e.m(jn5.e(fileLocation), "50_50", cg6Var.f, null);
                break;
            case 26:
                tg6 tg6Var = (tg6) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) this.d;
                byte b7 = tg6Var.i0;
                qh6 qh6Var2 = tg6Var.v0;
                tg6Var.y(false);
                tg6Var.g0 = false;
                if (tL_error6 == null) {
                    Activity parentActivity = qh6Var2.getParentActivity();
                    if (parentActivity != null) {
                        tg6Var.o(new z56(tg6Var, parentActivity, (byte) 18));
                        break;
                    }
                } else {
                    tg6Var.h0 = tL_error6.text;
                    if (b7 == 3) {
                        int i12 = tg6Var.j0;
                        if (i12 != 4) {
                            b = 2;
                            if (i12 != 2) {
                                if (i12 != 17) {
                                }
                            }
                        }
                        tg6Var.r();
                        if (b7 == 15) {
                            jn7.e().a(tg6Var, jn7.j4);
                        } else if (b7 == 2) {
                            hl.y3(true);
                            jn7.e().a(tg6Var, jn7.j4);
                        } else if (b7 == 3) {
                            hl.x3(true);
                            jn7.e().a(tg6Var, jn7.k4);
                        }
                        tg6Var.f0 = true;
                        if (b7 != 3) {
                            i2 = ((e) qh6Var2).currentAccount;
                            jj.c0(i2, tL_error6, qh6Var2, confirmphone, new Object[0]);
                        }
                        if (tL_error6.text.contains("PHONE_CODE_EMPTY") && !tL_error6.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                                tg6Var.c(true);
                                qh6Var2.J1(0, true, null, true);
                                break;
                            }
                        } else {
                            tg6Var.w();
                            break;
                        }
                    } else {
                        b = 2;
                    }
                    if (b7 == b) {
                        int i13 = tg6Var.j0;
                        b2 = 4;
                        if (i13 != 4) {
                        }
                        tg6Var.r();
                        if (b7 == 15) {
                        }
                        tg6Var.f0 = true;
                        if (b7 != 3) {
                        }
                        if (tL_error6.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        tg6Var.w();
                    } else {
                        b2 = 4;
                    }
                    if (b7 == b2) {
                        int i14 = tg6Var.j0;
                        if (i14 != b) {
                            if (i14 != 17) {
                            }
                        }
                        tg6Var.r();
                    }
                    if (b7 == 15) {
                    }
                    tg6Var.f0 = true;
                    if (b7 != 3) {
                    }
                    if (tL_error6.text.contains("PHONE_CODE_EMPTY")) {
                    }
                    tg6Var.w();
                }
                break;
            case 27:
                tg6 tg6Var2 = (tg6) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                byte b8 = tg6Var2.i0;
                qh6 qh6Var3 = tg6Var2.v0;
                tg6Var2.y(false);
                tg6Var2.g0 = false;
                if (tL_error7 == null) {
                    TLRPC.User user5 = (TLRPC.User) tLObject9;
                    tg6Var2.t();
                    tg6Var2.s();
                    i3 = ((e) qh6Var3).currentAccount;
                    yac.h(i3).v(user5);
                    i4 = ((e) qh6Var3).currentAccount;
                    yac.h(i4).u(true);
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(user5);
                    i5 = ((e) qh6Var3).currentAccount;
                    kf7.a0(i5).n1(arrayList5, null, true, true);
                    i6 = ((e) qh6Var3).currentAccount;
                    uc7.s1(i6).i4(user5, false, false);
                    i7 = ((e) qh6Var3).currentAccount;
                    jn7.f(i7).k(47, new Object[0]);
                    qh6Var3.getMessagesController().v4(0L, "VALIDATE_PHONE_NUMBER");
                    if (b8 == 3) {
                        hl.T();
                    }
                    tg6Var2.o(new gg6(tg6Var2, (byte) 5));
                    break;
                } else {
                    tg6Var2.h0 = tL_error7.text;
                    tg6Var2.g0 = false;
                    qh6Var3.K1(false, true);
                    if (b8 == 3) {
                        int i15 = tg6Var2.j0;
                        if (i15 != 4) {
                            b3 = 2;
                            if (i15 != 2) {
                                if (i15 != 17) {
                                }
                            }
                        }
                        tg6Var2.r();
                        if (b8 == 15) {
                            jn7.e().a(tg6Var2, jn7.j4);
                        } else if (b8 == 2) {
                            hl.y3(true);
                            jn7.e().a(tg6Var2, jn7.j4);
                        } else if (b8 == 3) {
                            hl.x3(true);
                            jn7.e().a(tg6Var2, jn7.k4);
                        }
                        tg6Var2.f0 = true;
                        if (b8 != 3) {
                            if (tL_error7.text.contains("PHONE_NUMBER_INVALID")) {
                                qh6Var3.z1(ob6.M0(2131745798, null), ob6.M0(2131748933, "InvalidPhoneNumber"));
                            } else if (tL_error7.text.contains("PHONE_CODE_EMPTY") || tL_error7.text.contains("PHONE_CODE_INVALID")) {
                                tg6Var2.w();
                                break;
                            } else if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                                tg6Var2.c(true);
                                qh6Var3.J1(0, true, null, true);
                                qh6Var3.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                            } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                                qh6Var3.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, "FloodWait"));
                            } else {
                                qh6Var3.z1(ob6.M0(2131745798, null), ob6.M0(2131751070, "ErrorOccurred") + "\n" + tL_error7.text);
                            }
                            int i16 = 0;
                            while (true) {
                                bk2 bk2Var = tg6Var2.f;
                                ok2[] ok2VarArr = bk2Var.f;
                                if (i16 >= ok2VarArr.length) {
                                    bk2Var.e = false;
                                    ok2VarArr[0].requestFocus();
                                    break;
                                } else {
                                    ok2VarArr[i16].setText("");
                                    i16++;
                                }
                            }
                        }
                    } else {
                        b3 = 2;
                    }
                    if (b8 == b3) {
                        int i17 = tg6Var2.j0;
                        b4 = 4;
                        if (i17 != 4) {
                        }
                        tg6Var2.r();
                        if (b8 == 15) {
                        }
                        tg6Var2.f0 = true;
                        if (b8 != 3) {
                        }
                    } else {
                        b4 = 4;
                    }
                    if (b8 == b4) {
                        int i18 = tg6Var2.j0;
                        if (i18 != b3) {
                            if (i18 != 17) {
                            }
                        }
                        tg6Var2.r();
                    }
                    if (b8 == 15) {
                    }
                    tg6Var2.f0 = true;
                    if (b8 != 3) {
                    }
                }
                break;
            case 28:
                tg6 tg6Var3 = (tg6) this.b;
                Bundle bundle3 = (Bundle) this.c;
                TLObject tLObject10 = (TLObject) this.d;
                tg6Var3.r0 = bundle3;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject10;
                tg6Var3.s0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    tg6Var3.j0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    tg6Var3.j0 = 16;
                }
                tg6Var3.v0.q1(bundle3, tL_auth_sentCode, true);
                break;
            default:
                zg6 zg6Var = (zg6) this.b;
                TLObject tLObject11 = (TLObject) this.c;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                c51 c51Var = zg6Var.b;
                qh6 qh6Var4 = zg6Var.w;
                zg6Var.s = -1;
                if (!(tLObject11 instanceof TLRPC.auth_SentCode)) {
                    if (tL_error8 != null) {
                        String str14 = tL_error8.text;
                        if (str14 != null && str14.startsWith("FLOOD_WAIT_")) {
                            hl.d3(new ug6(zg6Var, b6), Integer.parseInt(tL_error8.text.substring(11)) * 1000);
                            break;
                        } else {
                            String str15 = tL_error8.text;
                            if (str15 != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(str15)) {
                                qh6Var4.J1(0, true, null, true);
                                qh6Var4.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, null));
                                break;
                            } else {
                                zg6Var.e = tL_error8.text;
                                zg6Var.f = false;
                                c51Var.setLoading(false);
                                new d31(qh6Var4.a0, null).H(R.raw.error, ob6.a0(null, null, 2131743533, tL_error8.text));
                                break;
                            }
                        }
                    }
                } else {
                    zg6Var.f = false;
                    c51Var.setLoading(false);
                    wk5 parentLayout = qh6Var4.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        e eVar2 = fragmentStack.isEmpty() ? null : (e) bp1.m(1, fragmentStack);
                        ArrayList arrayList6 = new ArrayList(fragmentStack);
                        int size3 = arrayList6.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj = arrayList6.get(i19);
                            i19++;
                            e eVar3 = (e) obj;
                            if ((eVar3 instanceof p) && eVar3 != eVar2) {
                                eVar3.removeSelfFromStack();
                            }
                        }
                        if (eVar2 instanceof p) {
                            ((ActionBarLayout) parentLayout).j(true, false);
                        }
                    }
                    qh6Var4.q1(zg6Var.d, (TLRPC.auth_SentCode) tLObject11, true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ls5(Object obj, Object obj2, TLRPC.User user, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = user;
    }
}

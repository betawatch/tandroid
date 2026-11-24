// default package

import android.app.Activity;
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
import java.util.HashMap;
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
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dt5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dt5(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0269, code lost:
    
        if (r0 != 16) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0274, code lost:
    
        if (r0 != 3) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0280, code lost:
    
        if (r0 == 16) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x039e, code lost:
    
        if (r10 != 16) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03a9, code lost:
    
        if (r10 != 3) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03b5, code lost:
    
        if (r10 == 16) goto L166;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ActionBarLayout actionBarLayout;
        byte b;
        int i;
        byte b2;
        byte b3;
        byte b4;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        TLRPC.UserFull userFull = null;
        wy2 wy2Var = null;
        int i8 = 0;
        switch (this.a) {
            case 0:
                et5 et5Var = (et5) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                et5Var.h = null;
                et5Var.c = arrayList;
                et5Var.d = arrayList2;
                bu9 bu9Var = et5Var.e;
                bu9Var.f(arrayList, null);
                it5 it5Var = et5Var.n;
                it5Var.J0(et5Var.f - 1);
                et5Var.f();
                if (!bu9Var.e() && et5Var.b() <= 2) {
                    it5Var.t1.e(false, true);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                yv1 yv1Var = (yv1) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str = LaunchActivity.C1;
                if (tL_error == null) {
                    if (user != null && !m9c.D(user)) {
                        b10.u(jb6.a0(null, null, 2131747918, m9c.k(user, true)), c41.b0(yv1Var), R.raw.contact_check, 36);
                        break;
                    }
                } else {
                    c41.b0(yv1Var).g0(tL_error, false);
                    break;
                }
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                k16 k16Var = (k16) this.c;
                TLObject tLObject = (TLObject) this.d;
                String str2 = LaunchActivity.C1;
                try {
                    k16Var.run();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                if (tLObject instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject;
                    ik.u0(launchActivity, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                k16 k16Var2 = (k16) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                String str3 = LaunchActivity.C1;
                try {
                    k16Var2.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        ik.u0(launchActivity2, jb6.M0(2131743507, null), true);
                    } else {
                        launchActivity2.F0(ik.K(launchActivity2, null, jb6.M0(2131751042, null) + "\n" + tL_error2.text));
                    }
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 4:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                bmb bmbVar = (bmb) this.c;
                File file = (File) this.d;
                String str4 = LaunchActivity.C1;
                bmbVar.b(file, bmbVar.c);
                gm.c3(new rz5(launchActivity3, (byte) 8));
                break;
            case 5:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                int[] iArr = (int[]) this.c;
                long[] jArr = (long[]) this.d;
                String str5 = LaunchActivity.C1;
                int i9 = iArr[0] - 1;
                iArr[0] = i9;
                if (i9 == 0) {
                    nm7.f(launchActivity4.P).k(nm7.z5, new Object[0]);
                    launchActivity4.p0(jArr, false);
                    break;
                }
                break;
            case 6:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                bmb bmbVar2 = (bmb) this.d;
                String str6 = LaunchActivity.C1;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    launchActivity5.i0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                    launchActivity5.S0 = bmbVar2;
                    launchActivity5.Q0 = bc4.r(null, tL_wallPaper.document);
                    launchActivity5.R0 = tL_wallPaper;
                    bc4.G(bmbVar2.F).X(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 7:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                b16 b16Var = (b16) this.d;
                String str7 = LaunchActivity.C1;
                oc7.r1(launchActivity6.P).c4(user2, true, false);
                b16Var.a(user2);
                break;
            case 8:
                zk zkVar = (zk) this.b;
                String str8 = (String) this.c;
                String str9 = (String) this.d;
                LaunchActivity launchActivity7 = (LaunchActivity) zkVar.b;
                String str10 = LaunchActivity.C1;
                if (!"rebuild".equals(str8)) {
                    if (!"keys".equals(str8)) {
                        SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                        String str11 = "Blue";
                        String string = sharedPreferences.getString("lastDayTheme", "Blue");
                        if (cmb.O0(string) != null && !cmb.O0(string).o()) {
                            str11 = string;
                        }
                        String str12 = "Dark Blue";
                        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                        if (cmb.O0(string2) != null && cmb.O0(string2).o()) {
                            str12 = string2;
                        }
                        boolean z = "night".equals(str8) || !("day".equals(str8) || cmb.I.o());
                        if (z) {
                            str11 = str12;
                        }
                        bmb O0 = cmb.O0(str11);
                        StringBuilder sb = new StringBuilder("DEBUG_THEME ");
                        sb.append(z ? "night" : "day");
                        sb.append(" (");
                        sb.append(O0.k());
                        sb.append("), style ");
                        sb.append(str9);
                        Log.i("tmessages", sb.toString());
                        if (!"instant".equals(str9)) {
                            if (!"fade".equals(str9)) {
                                nm7.e().k(nm7.x4, O0, Boolean.FALSE, new int[]{launchActivity7.y0.getMeasuredWidth() / 2, launchActivity7.y0.getMeasuredHeight() / 2}, -1, Boolean.valueOf(z), null);
                                break;
                            } else {
                                cmb.I1(O0, false, -1, null);
                                break;
                            }
                        } else {
                            nm7.e().k(nm7.x4, O0, Boolean.FALSE, null, -1);
                            break;
                        }
                    } else {
                        HashSet r = anb.r();
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = r.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            if (sb2.length() > 0) {
                                sb2.append(',');
                            }
                            sb2.append(nxe.c(intValue));
                        }
                        Log.i("tmessages", "DEBUG_THEME keys on screen (" + r.size() + "): " + ((Object) sb2));
                        break;
                    }
                } else {
                    try {
                        launchActivity7.y0(true);
                        if (gm.O1() && (actionBarLayout = launchActivity7.r0) != null) {
                            actionBarLayout.W(true, true);
                        }
                        Log.i("tmessages", "DEBUG_THEME rebuilt fragment views");
                        break;
                    } catch (Exception e3) {
                        fc4.g(e3, true);
                        return;
                    }
                }
                break;
            case 9:
                a66 a66Var = (a66) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                String str13 = (String) this.d;
                a66Var.c();
                if (tLObject3 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject3;
                    if (!TwoStepVerificationActivity.b0(password, false)) {
                        ik.u0(a66Var.a, jb6.M0(2131743507, null), true);
                    }
                    t56 t56Var = new t56(a66Var, str13, (byte) 2);
                    if (!password.has_password) {
                        p5c p5cVar = new p5c(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? (byte) 6 : (byte) 5, password);
                        p5cVar.k0 = t56Var;
                        a66Var.u(p5cVar, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.J = password;
                        twoStepVerificationActivity.K = false;
                        a66Var.u(twoStepVerificationActivity, false);
                        t56Var.run();
                        break;
                    }
                }
                break;
            case 10:
                x56 x56Var = (x56) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.User user3 = (TLRPC.User) this.d;
                if (tLObject4 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject4;
                    x56Var.getMessagesController().d4(tL_users_userFull.users, false);
                    x56Var.getMessagesController().X3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull2 = userFull;
                sic.m(user3, false, userFull2 != null && userFull2.video_calls_available, x56Var.getParentActivity(), userFull2, x56Var.getAccountInstance());
                break;
            case 11:
                l66 l66Var = (l66) this.b;
                m66 m66Var = (m66) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                k66 k66Var = l66Var.h;
                if (k66Var != null && l66Var.e == m66Var) {
                    k66Var.a(clickableSpan);
                    l66Var.e = null;
                    l66Var.b.e(true);
                    break;
                }
                break;
            case 12:
                s96 s96Var = (s96) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                int i10 = s96Var.e;
                if (!s96Var.w) {
                    if (tLObject5 instanceof TL_phone.groupCall) {
                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject5;
                        oc7.r1(i10).d4(groupcall.users, false);
                        oc7.r1(i10).X3(groupcall.chats, false);
                        s96Var.s = groupcall.call;
                        nm7.f(i10).k(nm7.G2, Long.valueOf(s96Var.s.id));
                    } else if (tL_error3 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        gm.c3(new q96(s96Var, r3));
                    }
                    if (s96Var.I) {
                        Runnable runnable = s96Var.K;
                        if (runnable != null) {
                            gm.r(runnable);
                        }
                        q96 q96Var = new q96(s96Var, (byte) 0);
                        s96Var.K = q96Var;
                        gm.d3(q96Var, s96Var.o() ? 5000 : 20000);
                        break;
                    }
                }
                break;
            case 13:
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
            case 14:
                pc6 pc6Var = (pc6) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.d;
                ImageView imageView = new ImageView(pc6Var.getParentActivity());
                imageView.setImageBitmap(bitmap);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e4) {
                    fc4.g(e4, true);
                }
                gm.d3(new dt5(pc6Var, viewGroup, gLSurfaceView, (byte) 15), 100L);
                break;
            case 15:
                pc6 pc6Var2 = (pc6) this.b;
                try {
                    ((ViewGroup) this.c).removeView((GLSurfaceView) this.d);
                } catch (Exception e5) {
                    fc4.g(e5, true);
                }
                pc6Var2.J = true;
                pc6Var2.finishFragment();
                break;
            case 16:
                pc6 pc6Var3 = (pc6) this.b;
                he[] heVarArr = (he[]) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                try {
                    heVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                heVarArr[0] = null;
                pc6Var3.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                pc6Var3.finishFragment();
                break;
            case 17:
                dd6 dd6Var = (dd6) this.b;
                cd6 cd6Var = (cd6) this.c;
                cd6 cd6Var2 = (cd6) this.d;
                ArrayList arrayList3 = dd6Var.J;
                if (cd6Var != null) {
                    arrayList3.remove(cd6Var);
                }
                arrayList3.add(cd6Var2);
                dd6Var.K.k(cd6Var2, cd6Var2.a);
                dd6.q();
                nm7.e().k(nm7.H4, new Object[0]);
                break;
            case 18:
                ((mh6) this.b).F1((String) this.c, (TLRPC.auth_SentCode) this.d);
                break;
            case 19:
                ((mh6) this.b).q1((Bundle) this.c, (TLRPC.auth_SentCode) ((TLObject) this.d), true);
                break;
            case 20:
                qz qzVar = (qz) this.b;
                EditText editText = (EditText) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                editText.removeTextChangedListener(qzVar);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 21:
                ze6 ze6Var = (ze6) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                Bundle bundle = (Bundle) this.d;
                mh6 mh6Var = ze6Var.a0;
                if (!(tLObject6 instanceof TL_account.TL_emailVerified) || mh6Var.G != 3) {
                    if (!(tLObject6 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject6 instanceof TLRPC.TL_auth_authorization) {
                            mh6Var.C1((TLRPC.TL_auth_authorization) tLObject6, false);
                            break;
                        }
                    } else {
                        mh6Var.q1(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject6).sent_code, true);
                        break;
                    }
                } else {
                    mh6Var.finishFragment();
                    mh6Var.e0.run();
                    break;
                }
                break;
            case 22:
                zf6 zf6Var = (zf6) this.b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.FileLocation fileLocation = photoSize.location;
                zf6Var.O = fileLocation;
                zf6Var.P = photoSize2.location;
                zf6Var.e.m(gn5.e(fileLocation), "50_50", zf6Var.f, null);
                break;
            case 23:
                rg6 rg6Var = (rg6) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) this.d;
                byte b5 = rg6Var.i0;
                mh6 mh6Var2 = rg6Var.v0;
                rg6Var.y(false);
                rg6Var.g0 = false;
                if (tL_error4 == null) {
                    Activity parentActivity = mh6Var2.getParentActivity();
                    if (parentActivity != null) {
                        rg6Var.o(new k16(rg6Var, parentActivity, (byte) 22));
                        break;
                    }
                } else {
                    rg6Var.h0 = tL_error4.text;
                    if (b5 == 3) {
                        int i12 = rg6Var.j0;
                        if (i12 != 4) {
                            b = 2;
                            if (i12 != 2) {
                                if (i12 != 17) {
                                }
                            }
                        }
                        rg6Var.r();
                        if (b5 == 15) {
                            nm7.e().a(rg6Var, nm7.k4);
                        } else if (b5 == 2) {
                            gm.y3(true);
                            nm7.e().a(rg6Var, nm7.k4);
                        } else if (b5 == 3) {
                            gm.x3(true);
                            nm7.e().a(rg6Var, nm7.l4);
                        }
                        rg6Var.f0 = true;
                        if (b5 != 3) {
                            i = ((d) mh6Var2).currentAccount;
                            ik.c0(i, tL_error4, mh6Var2, confirmphone, new Object[0]);
                        }
                        if (tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                                rg6Var.d(true);
                                mh6Var2.J1(0, true, null, true);
                                break;
                            }
                        } else {
                            rg6Var.x();
                            break;
                        }
                    } else {
                        b = 2;
                    }
                    if (b5 == b) {
                        int i13 = rg6Var.j0;
                        b2 = 4;
                        if (i13 != 4) {
                        }
                        rg6Var.r();
                        if (b5 == 15) {
                        }
                        rg6Var.f0 = true;
                        if (b5 != 3) {
                        }
                        if (tL_error4.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        rg6Var.x();
                    } else {
                        b2 = 4;
                    }
                    if (b5 == b2) {
                        int i14 = rg6Var.j0;
                        if (i14 != b) {
                            if (i14 != 17) {
                            }
                        }
                        rg6Var.r();
                    }
                    if (b5 == 15) {
                    }
                    rg6Var.f0 = true;
                    if (b5 != 3) {
                    }
                    if (tL_error4.text.contains("PHONE_CODE_EMPTY")) {
                    }
                    rg6Var.x();
                }
                break;
            case 24:
                rg6 rg6Var2 = (rg6) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                byte b6 = rg6Var2.i0;
                mh6 mh6Var3 = rg6Var2.v0;
                rg6Var2.y(false);
                rg6Var2.g0 = false;
                if (tL_error5 == null) {
                    TLRPC.User user4 = (TLRPC.User) tLObject7;
                    rg6Var2.t();
                    rg6Var2.s();
                    i2 = ((d) mh6Var3).currentAccount;
                    z8c.h(i2).v(user4);
                    i3 = ((d) mh6Var3).currentAccount;
                    z8c.h(i3).u(true);
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user4);
                    i4 = ((d) mh6Var3).currentAccount;
                    cf7.Y(i4).j1(arrayList4, null, true, true);
                    i5 = ((d) mh6Var3).currentAccount;
                    oc7.r1(i5).c4(user4, false, false);
                    i6 = ((d) mh6Var3).currentAccount;
                    nm7.f(i6).k(47, new Object[0]);
                    mh6Var3.getMessagesController().p4(0L, "VALIDATE_PHONE_NUMBER");
                    if (b6 == 3) {
                        gm.T();
                    }
                    rg6Var2.o(new dg6(rg6Var2, r3));
                    break;
                } else {
                    rg6Var2.h0 = tL_error5.text;
                    rg6Var2.g0 = false;
                    mh6Var3.K1(false, true);
                    if (b6 == 3) {
                        int i15 = rg6Var2.j0;
                        if (i15 != 4) {
                            b3 = 2;
                            if (i15 != 2) {
                                if (i15 != 17) {
                                }
                            }
                        }
                        rg6Var2.r();
                        if (b6 == 15) {
                            nm7.e().a(rg6Var2, nm7.k4);
                        } else if (b6 == 2) {
                            gm.y3(true);
                            nm7.e().a(rg6Var2, nm7.k4);
                        } else if (b6 == 3) {
                            gm.x3(true);
                            nm7.e().a(rg6Var2, nm7.l4);
                        }
                        rg6Var2.f0 = true;
                        if (b6 != 3) {
                            if (tL_error5.text.contains("PHONE_NUMBER_INVALID")) {
                                mh6Var3.z1(jb6.M0(2131745804, null), jb6.M0(2131748936, "InvalidPhoneNumber"));
                            } else if (tL_error5.text.contains("PHONE_CODE_EMPTY") || tL_error5.text.contains("PHONE_CODE_INVALID")) {
                                rg6Var2.x();
                                break;
                            } else if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                                rg6Var2.d(true);
                                mh6Var3.J1(0, true, null, true);
                                mh6Var3.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, "CodeExpired"));
                            } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                                mh6Var3.z1(jb6.M0(2131745804, null), jb6.M0(2131750619, "FloodWait"));
                            } else {
                                mh6Var3.z1(jb6.M0(2131745804, null), jb6.M0(2131751042, "ErrorOccurred") + "\n" + tL_error5.text);
                            }
                            int i16 = 0;
                            while (true) {
                                tk2 tk2Var = rg6Var2.f;
                                gl2[] gl2VarArr = tk2Var.f;
                                if (i16 >= gl2VarArr.length) {
                                    tk2Var.e = false;
                                    gl2VarArr[0].requestFocus();
                                    break;
                                } else {
                                    gl2VarArr[i16].setText("");
                                    i16++;
                                }
                            }
                        }
                    } else {
                        b3 = 2;
                    }
                    if (b6 == b3) {
                        int i17 = rg6Var2.j0;
                        b4 = 4;
                        if (i17 != 4) {
                        }
                        rg6Var2.r();
                        if (b6 == 15) {
                        }
                        rg6Var2.f0 = true;
                        if (b6 != 3) {
                        }
                    } else {
                        b4 = 4;
                    }
                    if (b6 == b4) {
                        int i18 = rg6Var2.j0;
                        if (i18 != b3) {
                            if (i18 != 17) {
                            }
                        }
                        rg6Var2.r();
                    }
                    if (b6 == 15) {
                    }
                    rg6Var2.f0 = true;
                    if (b6 != 3) {
                    }
                }
                break;
            case 25:
                rg6 rg6Var3 = (rg6) this.b;
                Bundle bundle2 = (Bundle) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                rg6Var3.r0 = bundle2;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject8;
                rg6Var3.s0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    rg6Var3.j0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    rg6Var3.j0 = 16;
                }
                rg6Var3.v0.q1(bundle2, tL_auth_sentCode, true);
                break;
            case 26:
                wg6 wg6Var = (wg6) this.b;
                TLObject tLObject9 = (TLObject) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                b61 b61Var = wg6Var.b;
                mh6 mh6Var4 = wg6Var.w;
                wg6Var.s = -1;
                if (!(tLObject9 instanceof TLRPC.auth_SentCode)) {
                    if (tL_error6 != null) {
                        String str14 = tL_error6.text;
                        if (str14 != null && str14.startsWith("FLOOD_WAIT_")) {
                            gm.d3(new sg6(wg6Var, null == true ? 1 : 0), Integer.parseInt(tL_error6.text.substring(11)) * 1000);
                            break;
                        } else {
                            String str15 = tL_error6.text;
                            if (str15 != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(str15)) {
                                mh6Var4.J1(0, true, null, true);
                                mh6Var4.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, null));
                                break;
                            } else {
                                wg6Var.e = tL_error6.text;
                                wg6Var.f = false;
                                b61Var.setLoading(false);
                                new c41(mh6Var4.a0, null).H(R.raw.error, jb6.a0(null, null, 2131743565, tL_error6.text));
                                break;
                            }
                        }
                    }
                } else {
                    wg6Var.f = false;
                    b61Var.setLoading(false);
                    tk5 parentLayout = mh6Var4.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        d dVar = fragmentStack.isEmpty() ? null : (d) aq1.m(1, fragmentStack);
                        ArrayList arrayList5 = new ArrayList(fragmentStack);
                        int size = arrayList5.size();
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj = arrayList5.get(i19);
                            i19++;
                            d dVar2 = (d) obj;
                            if ((dVar2 instanceof p) && dVar2 != dVar) {
                                dVar2.removeSelfFromStack();
                            }
                        }
                        if (dVar instanceof p) {
                            ((ActionBarLayout) parentLayout).j(true, false);
                        }
                    }
                    mh6Var4.q1(wg6Var.d, (TLRPC.auth_SentCode) tLObject9, true);
                    break;
                }
                break;
            case 27:
                wg6 wg6Var2 = (wg6) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.c;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                mh6 mh6Var5 = wg6Var2.w;
                mh6Var5.e = true;
                mh6 mh6Var6 = (mh6) LaunchActivity.M();
                if (mh6Var6 == null) {
                    i7 = ((d) mh6Var5).currentAccount;
                    mh6Var6 = new mh6(i7);
                    d S = LaunchActivity.S();
                    if (S != null) {
                        S.presentFragment(mh6Var6);
                    }
                }
                mh6Var6.F1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 28:
                lh6 lh6Var = (lh6) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                jh6 jh6Var = lh6Var.a;
                if (tLObject10 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject10;
                    if (jh6Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList6 = lh6Var.H;
                        if (((String) hashMap.get(upperCase)) != null && arrayList6 != null) {
                            int i20 = 0;
                            while (true) {
                                if (i20 < arrayList6.size()) {
                                    if (arrayList6.get(i20) == null || !((wy2) arrayList6.get(i20)).a.equals(upperCase)) {
                                        i20++;
                                    } else {
                                        wy2Var = (wy2) arrayList6.get(i20);
                                    }
                                }
                            }
                            if (wy2Var != null) {
                                jh6Var.setText(wy2Var.c);
                                lh6Var.F = (byte) 0;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ak6 ak6Var = (ak6) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error7 != null) {
                    ak6Var.getClass();
                    break;
                } else {
                    ak6 ak6Var2 = ak6Var.t0.a;
                    while (true) {
                        ArrayList arrayList7 = ak6Var2.k0;
                        if (i8 >= arrayList7.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList7.get(i8)).link.equals(tL_chatInviteExported.link)) {
                            sj6 l0 = ak6Var2.l0();
                            arrayList7.remove(i8);
                            ak6Var2.n0(l0);
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
        }
    }
}

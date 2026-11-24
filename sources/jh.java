// default package

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jh implements dn7, ll5, dz0, sc7, gj, d39, um3, x56, ed, ma6, z29, us2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jh(aq1 aq1Var, int i, boolean z) {
        this.a = (byte) 3;
        this.c = aq1Var;
        this.b = i;
    }

    @Override // ll5
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        y10 y10Var = (y10) this.c;
        if (this.b == y10Var.b) {
            i20 i20Var = y10Var.e;
            Bitmap n = imageReceiver.n();
            int L = ((n == null || !imageReceiver.C()) && !imageReceiver.B()) ? 0 : gl.L(64.0f);
            z10 z10Var = i20Var.C1;
            ValueAnimator valueAnimator = i20Var.M2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                i20Var.M2 = null;
            }
            if (z10Var.getCustomPaddingRight() != L) {
                ValueAnimator ofInt = ValueAnimator.ofInt(z10Var.getCustomPaddingRight(), L);
                i20Var.M2 = ofInt;
                if (L == 0) {
                    ofInt.setStartDelay(200L);
                    i20Var.M2.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                i20Var.M2.setInterpolator(new DecelerateInterpolator());
                i20Var.M2.addUpdateListener(new f0(i20Var, (byte) 9));
                i20Var.M2.start();
            }
            if (i20Var.b2.getTag() != null) {
                i20Var.c2.setImageBitmap(n);
            }
        }
    }

    @Override // um3
    public final void a(float[] fArr, long j, int i) {
        xl3 xl3Var;
        switch (this.a) {
            case 7:
                ln3 ln3Var = (ln3) this.c;
                int i2 = this.b;
                if (!ln3Var.h && i2 == ln3Var.p) {
                    vm3 k = DictationLid.k(Math.min(0.6f, DictationLid.g(i)), fArr);
                    if (k == null) {
                        xl3Var = null;
                    } else if (k.c) {
                        xl3Var = DictationAsr.X(k.a, ln3Var.l, false);
                        if (xl3Var != null) {
                            DictationLid.i(k.a);
                            ln3Var.k(k.a);
                        }
                    } else {
                        xl3Var = DictationAsr.W(DictationLid.d, fArr, ln3Var.l, false);
                        if (xl3Var != null) {
                            ln3Var.k(xl3Var.u());
                        }
                    }
                    StringBuilder sb = new StringBuilder("tinyasr stop: tinylid ");
                    sb.append(i);
                    sb.append(" ms speech in ");
                    sb.append(j);
                    sb.append(" ms: ");
                    sb.append(k);
                    sb.append(" → ");
                    sb.append(xl3Var != null ? xl3Var : "-");
                    Log.d("Dictation", sb.toString());
                    if (xl3Var != null) {
                        vl3 vl3Var = (vl3) xl3Var.b;
                        xl3 xl3Var2 = ln3Var.l;
                        if (vl3Var != ((vl3) xl3Var2.b) || !((String) xl3Var.c).equals((String) xl3Var2.c)) {
                            ln3Var.i(xl3Var);
                            break;
                        }
                    }
                    ln3Var.e();
                    break;
                }
                break;
            default:
                p66 p66Var = (p66) this.c;
                p66Var.x.b.add(new a70(p66Var, this.b, fArr, i, j));
                break;
        }
    }

    @Override // us2
    public final void accept(Object obj) {
        q06 q06Var;
        q06 q06Var2;
        su6 su6Var = (su6) this.c;
        int i = this.b;
        try {
            try {
                q06Var2 = (q06) ((t56) obj).get();
                gre.l(q06Var2, "LibraryResult must not be null");
            } catch (InterruptedException e) {
                e = e;
                lad.g("MediaSessionStub", "Library operation failed", e);
                String str = q06.d;
                b6a b6aVar = new b6a("no error message provided", -1, Bundle.EMPTY);
                q06Var = new q06(b6aVar.a, SystemClock.elapsedRealtime(), b6aVar);
                q06Var2 = q06Var;
                ru6 ru6Var = su6Var.e;
                ru6Var.getClass();
                ru6Var.d(i, q06Var2);
            } catch (CancellationException e2) {
                lad.g("MediaSessionStub", "Library operation cancelled", e2);
                String str2 = q06.d;
                b6a b6aVar2 = new b6a("no error message provided", 1, Bundle.EMPTY);
                q06Var = new q06(b6aVar2.a, SystemClock.elapsedRealtime(), b6aVar2);
                q06Var2 = q06Var;
                ru6 ru6Var2 = su6Var.e;
                ru6Var2.getClass();
                ru6Var2.d(i, q06Var2);
            } catch (ExecutionException e3) {
                e = e3;
                lad.g("MediaSessionStub", "Library operation failed", e);
                String str3 = q06.d;
                b6a b6aVar3 = new b6a("no error message provided", -1, Bundle.EMPTY);
                q06Var = new q06(b6aVar3.a, SystemClock.elapsedRealtime(), b6aVar3);
                q06Var2 = q06Var;
                ru6 ru6Var22 = su6Var.e;
                ru6Var22.getClass();
                ru6Var22.d(i, q06Var2);
            }
            ru6 ru6Var222 = su6Var.e;
            ru6Var222.getClass();
            ru6Var222.d(i, q06Var2);
        } catch (RemoteException e4) {
            lad.g("MediaSessionStub", "Failed to send result to browser " + su6Var, e4);
        }
    }

    @Override // ma6
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        HashMap hashMap = (HashMap) this.c;
        String str = LaunchActivity.C1;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            k27 k27Var = (k27) ((Map.Entry) it.next()).getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            z3a.B(this.b).q0(x3a.d(messageMedia2, k27.B0(k27Var.k), k27Var, null, null, null, true, 0));
            messageMedia = messageMedia2;
        }
    }

    @Override // dn7
    public final String c(int i) {
        Calendar calendar = (Calendar) this.c;
        int i2 = this.b;
        calendar.clear();
        calendar.set(1, i2);
        calendar.set(2, 0);
        calendar.add(2, i - 120);
        if (calendar.get(1) != i2) {
            return k96.D0().u0().format(calendar.getTimeInMillis());
        }
        k96 D0 = k96.D0();
        if (D0.r == null) {
            synchronized (D0) {
                if (D0.r == null) {
                    Locale locale = D0.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    D0.r = k96.k(locale, D0.O0(2131742503, "formatterMonthOnly", null), "MMMM");
                }
            }
        }
        return D0.r.format(calendar.getTimeInMillis());
    }

    @Override // dz0
    public final void cancel() {
        ConnectionsManager.getInstance(((zz0) this.c).a).cancelRequest(this.b, true);
    }

    @Override // d39
    public final void e(float f, float f2, int i, View view) {
        byte b = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 6:
                ((ContactsActivity) obj).k0(view, i2, i);
                break;
            default:
                gg7 gg7Var = (gg7) obj;
                dg7 dg7Var = gg7Var.T1;
                HashSet hashSet = gg7Var.Y1;
                if (view instanceof kz9) {
                    TLRPC.User user = ((kz9) view).getUser();
                    long j = user.id;
                    if (hashSet.contains(Long.valueOf(j))) {
                        hashSet.remove(Long.valueOf(j));
                    } else {
                        hashSet.add(Long.valueOf(j));
                        gg7Var.d2.put(Long.valueOf(j), user);
                    }
                    if (hashSet.size() != i2 + 1) {
                        dg7Var.b(true, hashSet, new yf7(gg7Var, (byte) 2), null);
                        gg7Var.b1(true, false);
                        if (!TextUtils.isEmpty(gg7Var.e2)) {
                            gg7Var.e2 = null;
                            dg7Var.setText("");
                            gl.r(gg7Var.o2);
                            gg7Var.a1(true, true);
                            break;
                        }
                    } else {
                        hashSet.remove(Long.valueOf(j));
                        String G = k96.G(gg7Var.k2, "BotMultiContactsSelectorLimit", new Object[0]);
                        ww0 ww0Var = gg7Var.c;
                        new u21(ww0Var, gg7Var.J0).Q(R.raw.chats_infotip, 36, G).k(true);
                        try {
                            ww0Var.performHapticFeedback(3, 2);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // x56
    public final void invoke(Object obj) {
        mc8 mc8Var = (mc8) obj;
        mc8Var.r(this.b, (br6) this.c);
    }

    @Override // sc7
    public final void k(boolean z) {
        mu1 mu1Var = ((aq1) this.c).b;
        int i = this.b;
        if (i == 15 && hc2.T(mu1Var.e)) {
            TLRPC.Chat chat = mu1Var.e;
            if (!chat.megagroup || hc2.t0(chat)) {
                mu1Var.getMessagesController().T(2, mu1Var.l6, z);
                return;
            }
        }
        if (i == 15) {
            mu1Var.va(mu1Var.s4, z);
            return;
        }
        kk7 notificationCenter = mu1Var.getNotificationCenter();
        int i2 = kk7.s;
        notificationCenter.n(mu1Var, i2);
        mu1Var.getNotificationCenter().k(i2, new Object[0]);
        mu1Var.finishFragment();
        mu1Var.getNotificationCenter().k(kk7.J2, Long.valueOf(mu1Var.l6), mu1Var.f, mu1Var.e, Boolean.valueOf(z));
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // d39
    public final boolean q(View view) {
        byte b = this.a;
        return false;
    }

    @Override // z29
    public final int run() {
        t26 t26Var = ((m66) this.c).c;
        int L = gl.L(60.0f);
        int i = this.b;
        t26Var.g1(i, L);
        return i;
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        byte b = this.a;
        Object obj = this.c;
        int i3 = this.b;
        switch (b) {
            case 4:
                gl.e3(new bt(i, i3, obj, (byte) 3), 16L);
                break;
            default:
                gl.e3(new bt(i, i3, obj, (byte) 4), 16L);
                break;
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 9:
                String str = LaunchActivity.C1;
                ArrayList arrayList = ((LaunchActivity) obj).e0;
                if (!arrayList.isEmpty()) {
                    na7.q1(i2).z3("spambot", (d) b00.f(1, arrayList), 1, null);
                    break;
                }
                break;
            case 13:
                mf6 mf6Var = ((lf6) obj).h0;
                if (y6c.t0 != i2) {
                    ((LaunchActivity) mf6Var.getParentActivity()).N0(i2);
                }
                mf6Var.finishFragment();
                break;
            case 16:
                vx7 vx7Var = ((gx7) obj).a;
                vx7Var.B1(vx7Var.Z[i2]);
                break;
            case 17:
                ((PrivacyControlActivity) obj).presentFragment(new PrivacyControlActivity(i2, false), true);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                TLRPC.UserFull W1 = profileActivity.getMessagesController().W1(profileActivity.e1);
                if (W1 != null) {
                    W1.flags2 &= -4194305;
                    W1.note = null;
                    profileActivity.getMessagesStorage().g2(W1, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.id = profileActivity.getMessagesController().m1(profileActivity.e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.e4();
                profileActivity.d.r(i2);
                break;
        }
    }

    public /* synthetic */ jh(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ jh(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
    }

    private final void d(View view, float f, float f2) {
    }

    private final void f(View view, float f, float f2) {
    }
}

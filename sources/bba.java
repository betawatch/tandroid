// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bba extends FrameLayout implements gk7 {
    public static final /* synthetic */ int J = 0;
    public int E;
    public boolean F;
    public String G;
    public z6a H;
    public aba I;
    public final ev3[] a;
    public byte b;
    public int c;
    public long d;
    public ArrayList e;
    public final ArrayList f;
    public boolean h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final HashMap w;
    public TLRPC.WebPage x;
    public int y;

    public bba(Activity activity, wjb wjbVar) {
        super(activity);
        this.a = new ev3[2];
        this.b = (byte) 0;
        this.f = new ArrayList();
        this.n = true;
        this.s = new ArrayList();
        this.w = new HashMap();
        int i = 0;
        while (true) {
            ev3[] ev3VarArr = this.a;
            if (i >= ev3VarArr.length) {
                ev3VarArr[0].setVisibility(0);
                this.a[1].setVisibility(8);
                return;
            } else {
                ev3VarArr[i] = new ev3(this, activity, wjbVar);
                addView(this.a[i], nme.c(-1.0f, -1));
                i++;
            }
        }
    }

    public static void a(ev3 ev3Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = (ImageView) ev3Var.c;
        be0 be0Var = (be0) ev3Var.r;
        imageView.setImageResource(R.drawable.msg_link2);
        ((ImageView) ev3Var.c).setVisibility(0);
        ((FrameLayout) ev3Var.h).setVisibility(8);
        ((ImageView) ev3Var.s).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((jia) ev3Var.d).l(str2, false);
        String str3 = webPage.title;
        if (str3 == null || webPage.site_name == null) {
            str3 = webPage.description;
        }
        if (str3 == null) {
            String str4 = webPage.display_url;
            if (str4 != null) {
                str = str4;
            }
            str3 = str;
        }
        ((jia) ev3Var.e).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w = ba4.w(photo.sizes, kk7.q5, false, null, false);
            TLRPC.PhotoSize w2 = ba4.w(webPage.photo.sizes, gl.L(40.0f), false, null, false);
            if (w != null) {
                be0Var.setRoundRadius(gl.L(4.0f));
                be0Var.g(1, 0L, gl5.f(w, webPage.photo), gl5.f(w2, webPage.photo), webPage, "50_50", "50_50_b", null);
                be0Var.setVisibility(0);
            } else {
                be0Var.setVisibility(8);
            }
        } else {
            be0Var.setVisibility(8);
        }
        ((LinearLayout) ev3Var.b).setClickable(false);
    }

    public static void b(be0 be0Var, jm6 jm6Var) {
        if (jm6Var == null) {
            be0Var.setVisibility(8);
            return;
        }
        int i = jm6Var.C;
        String str = jm6Var.I;
        be0Var.setVisibility(0);
        be0Var.q();
        String str2 = jm6Var.c;
        if (str2 != null) {
            be0Var.o(str2, null, null);
            return;
        }
        if (str == null) {
            be0Var.setImageDrawable(null);
            return;
        }
        if (jm6Var.b) {
            be0Var.o(mue.d("vthumb://", i, ":", str), null, null);
            return;
        }
        be0Var.r(jm6Var.J, jm6Var.K, true);
        be0Var.o("thumb://" + i + ":" + str, null, null);
    }

    public final String c(ev3 ev3Var) {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            long longValue = ((Long) obj).longValue();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            if (longValue == this.d) {
                sb.append(k96.M0(2131745709, null));
            } else {
                int size2 = arrayList.size();
                int i2 = this.c;
                sb.append(size2 == 1 ? cf3.k(i2, longValue) : cf3.r(i2, longValue));
            }
        }
        String a0 = k96.a0(null, null, 2131745247, sb.toString());
        jia jiaVar = (jia) ev3Var.e;
        return (arrayList.size() > 2 || jiaVar.getPaint().measureText(a0) > ((float) (jiaVar.getMeasuredWidth() <= 0 ? gl.q.x - gl.L(140.0f) : jiaVar.getMeasuredWidth()))) ? k96.G(arrayList.size(), "ShareSendToMany", new Object[0]) : a0;
    }

    public final void d() {
        if (this.y != 0) {
            ConnectionsManager.getInstance(j5.a(this.c).a).cancelRequest(this.y, true);
            this.y = 0;
        }
        this.E++;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.v0 && this.x != null && i2 == this.c) {
            vf6 vf6Var = (vf6) objArr[0];
            for (int i3 = 0; i3 < vf6Var.m(); i3++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) vf6Var.n(i3);
                if (webPage != null && webPage.id == this.x.id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.x = null;
                        d();
                        if (this.b != 0) {
                            this.b = (byte) 0;
                            aba abaVar = this.I;
                            if (abaVar != null) {
                                ((ag3) abaVar).g(0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (webPage instanceof TLRPC.TL_webPage) {
                        this.x = webPage;
                        ArrayList arrayList = this.s;
                        String str = arrayList.isEmpty() ? "" : TextUtils.join(" ", arrayList).toString();
                        HashMap hashMap = this.w;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.a[0], webPage, str);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(CharSequence charSequence, boolean z) {
        ArrayList arrayList;
        aba abaVar;
        boolean z2;
        if (charSequence != null && charSequence.length() != 0) {
            try {
                Matcher matcher = gl.S.matcher(charSequence);
                arrayList = null;
                while (matcher.find()) {
                    try {
                        if (matcher.start() <= 0 || charSequence.charAt(matcher.start() - 1) != '@') {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(charSequence.subSequence(matcher.start(), matcher.end()));
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
            ArrayList arrayList2 = this.s;
            if (!z) {
                if (arrayList != null) {
                    if (arrayList.size() == arrayList2.size()) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i), (CharSequence) arrayList2.get(i))) {
                            }
                        }
                        z2 = true;
                    }
                    z2 = false;
                    break;
                }
                z2 = arrayList2.isEmpty();
                if (z2) {
                    return;
                }
            }
            arrayList2.clear();
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                if (!arrayList.isEmpty()) {
                    String str = TextUtils.join(" ", arrayList).toString();
                    if (!this.n) {
                        String str2 = this.r;
                        if (str2 != null && str2.equals(str)) {
                            return;
                        }
                        this.n = true;
                        this.r = null;
                    }
                    byte b = this.b;
                    boolean z3 = (b == 2 || b == 0) ? false : true;
                    if (b != 2) {
                        this.b = (byte) 2;
                    }
                    if (z3) {
                        k();
                    }
                    TLRPC.WebPage webPage = (TLRPC.WebPage) this.w.get(str);
                    ev3[] ev3VarArr = this.a;
                    if (webPage != null) {
                        this.x = webPage;
                        a(ev3VarArr[0], webPage, str);
                    } else {
                        ev3 ev3Var = ev3VarArr[0];
                        ((ImageView) ev3Var.c).setImageResource(R.drawable.msg_link2);
                        ((ImageView) ev3Var.c).setVisibility(0);
                        ((FrameLayout) ev3Var.h).setVisibility(8);
                        ((be0) ev3Var.r).setVisibility(8);
                        ((ImageView) ev3Var.s).setVisibility(0);
                        ((jia) ev3Var.d).l(k96.M0(2131750455, null), false);
                        ((jia) ev3Var.e).l(str == null ? "" : str, false);
                        ((LinearLayout) ev3Var.b).setClickable(false);
                        d();
                        if (str != null && !str.isEmpty()) {
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            int i2 = this.E + 1;
                            this.E = i2;
                            this.y = ConnectionsManager.getInstance(j5.a(this.c).a).sendRequest(getwebpagepreview, new b97(this, i2, str, (byte) 10));
                        }
                    }
                    ev3 ev3Var2 = ev3VarArr[0];
                    String str3 = this.G;
                    if (str3 != null) {
                        ((jia) ev3Var2.f).l(str3, false);
                    }
                    byte b2 = this.b;
                    if (b == b2 || (abaVar = this.I) == null) {
                        return;
                    }
                    ((ag3) abaVar).g(b2);
                    return;
                }
            }
            d();
            this.x = null;
            if (this.b == 0) {
                this.b = (byte) 0;
                aba abaVar2 = this.I;
                if (abaVar2 != null) {
                    ((ag3) abaVar2).g(0);
                    return;
                }
                return;
            }
            return;
        }
        arrayList = null;
        ArrayList arrayList22 = this.s;
        if (!z) {
        }
        arrayList22.clear();
        if (arrayList != null) {
        }
        d();
        this.x = null;
        if (this.b == 0) {
        }
    }

    public final be0 f(int i) {
        be0[] be0VarArr;
        if (this.b != 1 || (be0VarArr = (be0[]) this.a[0].n) == null || i < 0 || i >= be0VarArr.length || be0VarArr[i].getVisibility() != 0) {
            return null;
        }
        return be0VarArr[i];
    }

    public final void g(int i) {
        h(i);
        this.d = y6c.h(j5.a(i).a).e();
        this.e = null;
        this.h = true;
        this.n = true;
        this.r = null;
        this.x = null;
        d();
        this.s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.x;
    }

    public int getMode() {
        return this.b;
    }

    public final void h(int i) {
        int i2 = this.c;
        int i3 = kk7.v0;
        if (i2 == i) {
            this.c = i;
            if (isAttachedToWindow()) {
                kk7.f(this.c).b(this, i3);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            kk7.f(this.c).n(this, i3);
        }
        this.c = i;
        if (isAttachedToWindow()) {
            kk7.f(this.c).b(this, i3);
        }
    }

    public final void i(int i, ArrayList arrayList) {
        aba abaVar;
        h(i);
        this.d = y6c.h(j5.a(i).a).e();
        this.e = arrayList;
        this.h = false;
        this.x = null;
        d();
        this.s.clear();
        byte b = this.b;
        boolean z = (b == 1 || b == 0) ? false : true;
        this.b = (byte) 1;
        if (z) {
            k();
        }
        ev3[] ev3VarArr = this.a;
        ev3 ev3Var = ev3VarArr[0];
        ImageView imageView = (ImageView) ev3Var.c;
        jia jiaVar = (jia) ev3Var.e;
        be0[] be0VarArr = (be0[]) ev3Var.n;
        jia jiaVar2 = (jia) ev3Var.d;
        imageView.setImageResource(R.drawable.filled_forward);
        ((ImageView) ev3Var.c).setVisibility(0);
        ((be0) ev3Var.r).setVisibility(8);
        ((FrameLayout) ev3Var.h).setVisibility(0);
        ((ImageView) ev3Var.s).setVisibility(8);
        ((LinearLayout) ev3Var.b).setClickable(true);
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            jiaVar2.l("", false);
            jiaVar.l("", false);
            for (be0 be0Var : be0VarArr) {
                be0Var.setVisibility(8);
            }
        } else {
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                if (((jm6) obj).b) {
                    i2++;
                } else {
                    i3++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                jiaVar2.l(k96.M0(((jm6) arrayList2.get(0)).b ? 2131745241 : 2131745252, null), false);
            } else if (i2 == 0) {
                jiaVar2.l(k96.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i3 == 0) {
                jiaVar2.l(k96.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                jiaVar2.l(k96.G(size2, "ShareSendItems", new Object[0]), false);
            }
            jiaVar.l(c(ev3Var), false);
            b(be0VarArr[0], arrayList2.size() > 0 ? (jm6) arrayList2.get(0) : null);
            b(be0VarArr[1], arrayList2.size() > 1 ? (jm6) arrayList2.get(1) : null);
            b(be0VarArr[2], arrayList2.size() > 2 ? (jm6) arrayList2.get(2) : null);
        }
        ev3 ev3Var2 = ev3VarArr[0];
        String str = this.G;
        if (str != null) {
            ((jia) ev3Var2.f).l(str, false);
        }
        byte b2 = this.b;
        if (b == b2 || (abaVar = this.I) == null) {
            return;
        }
        ((ag3) abaVar).g(b2);
    }

    public final void j() {
        z6a z6aVar = this.H;
        if (z6aVar != null) {
            gl.r(z6aVar);
            this.H = null;
        }
        this.F = false;
        for (ev3 ev3Var : this.a) {
            jia jiaVar = (jia) ev3Var.e;
            jiaVar.setAlpha(1.0f);
            jiaVar.setScaleX(1.0f);
            jiaVar.setScaleY(1.0f);
            ((jia) ev3Var.f).setAlpha(0.0f);
        }
    }

    public final void k() {
        ev3[] ev3VarArr = this.a;
        ev3 ev3Var = ev3VarArr[0];
        ev3 ev3Var2 = ev3VarArr[1];
        ev3VarArr[0] = ev3Var2;
        ev3VarArr[1] = ev3Var;
        ev3Var2.getClass();
        ev3VarArr[0].setVisibility(0);
        ev3VarArr[0].setScaleX(0.8f);
        ev3VarArr[0].setScaleY(0.8f);
        ev3VarArr[0].setAlpha(0.0f);
        ev3VarArr[0].setTranslationY(gl.L(20.0f));
        ViewPropertyAnimator translationY = ev3VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        s33 s33Var = s33.h;
        ug8.t(translationY, s33Var, 320L);
        ev3 ev3Var3 = ev3VarArr[1];
        ev3Var3.getClass();
        ev3Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-gl.L(20.0f)).setInterpolator(s33Var).setDuration(320L).withEndAction(new z6a(ev3Var3, (byte) 3)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.c).b(this, kk7.v0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.c).n(this, kk7.v0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (ev3 ev3Var : this.a) {
            ((LinearLayout) ev3Var.b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(aba abaVar) {
        this.I = abaVar;
    }
}

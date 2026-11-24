// default package

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nc2 {
    public final boolean a;
    public final ImageReceiver b;
    public final pc0 c;
    public final RectF d;
    public final u51 e;
    public StaticLayout f;
    public StaticLayout g;
    public StaticLayout h;
    public boolean i;
    public int j;
    public fg0 k;
    public int l;
    public qa6 m;
    public boolean n;
    public final float[] o;

    public nc2(rc2 rc2Var, boolean z) {
        ImageReceiver imageReceiver = new ImageReceiver(rc2Var);
        this.b = imageReceiver;
        this.c = new pc0((ylb) null);
        this.d = new RectF();
        this.e = new u51(rc2Var);
        this.o = new float[8];
        this.a = z;
        imageReceiver.q0(gm.L(16.0f) / 2);
        if (rc2Var.O0) {
            imageReceiver.I();
        }
    }

    public final void a(String str, TLObject tLObject, CharSequence charSequence, TextPaint textPaint, CharSequence charSequence2, int i) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int L = i - gm.L(22.0f);
        this.j = gm.L(16.0f);
        StaticLayout X2 = rc2.X2(L, rc2.Jd, str);
        this.f = X2;
        if (X2 != null) {
            int L2 = gm.L(4.0f) + rc2.N1(X2);
            L -= L2;
            this.j = hg9.v(6.0f, L2, this.j);
        }
        int i2 = 0;
        boolean z = tLObject != null && (!(tLObject instanceof TLRPC.User) ? !(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null || chatPhoto.photo_small == null : (userProfilePhoto = ((TLRPC.User) tLObject).photo) == null || userProfilePhoto.photo_small == null);
        this.i = z;
        ImageReceiver imageReceiver = this.b;
        if (z) {
            pc0 pc0Var = this.c;
            pc0Var.o(tLObject);
            imageReceiver.U(tLObject, pc0Var, null);
            L -= gm.L(21.0f);
            this.j = hg9.v(21.0f, this.f == null ? gm.L(6.0f) : 0, this.j);
        } else {
            imageReceiver.f();
        }
        SpannableStringBuilder O3 = rc2.O3(charSequence2);
        int i3 = i / 2;
        StaticLayout X22 = rc2.X2(L - (O3 == null ? 0 : gm.L(4.0f) + Math.min(i3, (int) Math.ceil(rc2.Kd.measureText(O3, 0, O3.length())))), textPaint, charSequence);
        this.g = X22;
        if (X22 != null) {
            int L3 = gm.L(4.0f) + rc2.N1(X22);
            L -= L3;
            this.j = ((this.f != null || this.i) ? 0 : gm.L(6.0f)) + L3 + this.j;
        }
        StaticLayout X23 = L > gm.L(24.0f) ? rc2.X2(Math.min(i3, L), rc2.Kd, O3) : null;
        this.h = X23;
        if (X23 == null) {
            if (this.g == null && this.f == null) {
                return;
            }
            this.j -= gm.L(4.0f);
            return;
        }
        int i4 = this.j;
        if (this.f == null && !this.i && this.g == null) {
            i2 = gm.L(6.0f);
        }
        this.j = rc2.N1(this.h) + i2 + i4;
    }
}

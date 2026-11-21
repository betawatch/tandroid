package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.q80;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class n1 {
    public final boolean a;
    public final ImageReceiver b;
    public final org.telegram.ui.Components.b9 c;
    public final RectF d;
    public final mc e;
    public StaticLayout f;
    public StaticLayout g;
    public StaticLayout h;
    public boolean i;
    public int j;
    public y k;
    public int l;
    public q80 m;
    public boolean n;
    public final float[] o;

    public n1(r1 r1Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(r1Var);
        this.b = imageReceiver;
        this.c = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.d = new RectF();
        this.e = new mc(r1Var);
        this.o = new float[8];
        this.a = z10;
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f) / 2);
        if (r1Var.O0) {
            imageReceiver.P();
        }
    }

    public final void a(String str, TLObject tLObject, CharSequence charSequence, TextPaint textPaint, CharSequence charSequence2, int i7) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int L = i7 - org.telegram.messenger.g0.L(22.0f);
        this.j = org.telegram.messenger.g0.L(16.0f);
        StaticLayout X2 = r1.X2(str, r1.xd, L);
        this.f = X2;
        if (X2 != null) {
            int L2 = org.telegram.messenger.g0.L(4.0f) + r1.L1(X2);
            L -= L2;
            this.j = org.telegram.messenger.f3.C(6.0f, L2, this.j);
        }
        int i10 = 0;
        boolean z10 = tLObject != null && (!(tLObject instanceof TLRPC.User) ? !(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null || chatPhoto.photo_small == null : (userProfilePhoto = ((TLRPC.User) tLObject).photo) == null || userProfilePhoto.photo_small == null);
        this.i = z10;
        ImageReceiver imageReceiver = this.b;
        if (z10) {
            org.telegram.ui.Components.b9 b9Var = this.c;
            b9Var.p(tLObject);
            imageReceiver.i0(tLObject, b9Var, null);
            L -= org.telegram.messenger.g0.L(21.0f);
            this.j = org.telegram.messenger.f3.C(21.0f, this.f == null ? org.telegram.messenger.g0.L(6.0f) : 0, this.j);
        } else {
            imageReceiver.f();
        }
        SpannableStringBuilder N3 = r1.N3(charSequence2);
        int i11 = i7 / 2;
        StaticLayout X22 = r1.X2(charSequence, textPaint, L - (N3 != null ? org.telegram.messenger.g0.L(4.0f) + (N3 == null ? 0 : Math.min(i11, (int) Math.ceil(r1.yd.measureText(N3, 0, N3.length())))) : 0));
        this.g = X22;
        if (X22 != null) {
            int L3 = org.telegram.messenger.g0.L(4.0f) + r1.L1(X22);
            L -= L3;
            this.j = ((this.f != null || this.i) ? 0 : org.telegram.messenger.g0.L(6.0f)) + L3 + this.j;
        }
        StaticLayout X23 = L > org.telegram.messenger.g0.L(24.0f) ? r1.X2(N3, r1.yd, Math.min(i11, L)) : null;
        this.h = X23;
        if (X23 == null) {
            if (this.g == null && this.f == null) {
                return;
            }
            this.j -= org.telegram.messenger.g0.L(4.0f);
            return;
        }
        int i12 = this.j;
        if (this.f == null && !this.i && this.g == null) {
            i10 = org.telegram.messenger.g0.L(6.0f);
        }
        this.j = r1.L1(this.h) + i10 + i12;
    }
}

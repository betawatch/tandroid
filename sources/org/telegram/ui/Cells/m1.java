package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.t80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m1 {
    public final boolean a;
    public final ImageReceiver b;
    public final org.telegram.ui.Components.r8 c;
    public final RectF d;
    public final dc e;
    public StaticLayout f;
    public StaticLayout g;
    public StaticLayout h;
    public boolean i;
    public int j;
    public y k;
    public int l;
    public t80 m;
    public boolean n;
    public final float[] o;

    public m1(q1 q1Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        this.b = imageReceiver;
        this.c = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.d = new RectF();
        this.e = new dc(q1Var);
        this.o = new float[8];
        this.a = z10;
        imageReceiver.J0(org.telegram.messenger.i0.L(16.0f) / 2);
        if (q1Var.N0) {
            imageReceiver.P();
        }
    }

    public final void a(String str, TLObject tLObject, CharSequence charSequence, TextPaint textPaint, CharSequence charSequence2, int i10) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int L = i10 - org.telegram.messenger.i0.L(22.0f);
        this.j = org.telegram.messenger.i0.L(16.0f);
        StaticLayout R2 = q1.R2(str, q1.fd, L);
        this.f = R2;
        if (R2 != null) {
            int L2 = org.telegram.messenger.i0.L(4.0f) + q1.I1(R2);
            L -= L2;
            this.j = org.telegram.messenger.m5.C(6.0f, L2, this.j);
        }
        int i11 = 0;
        boolean z10 = tLObject != null && (!(tLObject instanceof TLRPC.User) ? !(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null || chatPhoto.photo_small == null : (userProfilePhoto = ((TLRPC.User) tLObject).photo) == null || userProfilePhoto.photo_small == null);
        this.i = z10;
        ImageReceiver imageReceiver = this.b;
        if (z10) {
            org.telegram.ui.Components.r8 r8Var = this.c;
            r8Var.p(tLObject);
            imageReceiver.i0(tLObject, r8Var, null);
            L -= org.telegram.messenger.i0.L(21.0f);
            this.j = org.telegram.messenger.m5.C(21.0f, this.f == null ? org.telegram.messenger.i0.L(6.0f) : 0, this.j);
        } else {
            imageReceiver.f();
        }
        SpannableStringBuilder H3 = q1.H3(charSequence2);
        int i12 = i10 / 2;
        StaticLayout R22 = q1.R2(charSequence, textPaint, L - (H3 != null ? org.telegram.messenger.i0.L(4.0f) + (H3 == null ? 0 : Math.min(i12, (int) Math.ceil(q1.gd.measureText(H3, 0, H3.length())))) : 0));
        this.g = R22;
        if (R22 != null) {
            int L3 = org.telegram.messenger.i0.L(4.0f) + q1.I1(R22);
            L -= L3;
            this.j = ((this.f != null || this.i) ? 0 : org.telegram.messenger.i0.L(6.0f)) + L3 + this.j;
        }
        StaticLayout R23 = L > org.telegram.messenger.i0.L(24.0f) ? q1.R2(H3, q1.gd, Math.min(i12, L)) : null;
        this.h = R23;
        if (R23 == null) {
            if (this.g == null && this.f == null) {
                return;
            }
            this.j -= org.telegram.messenger.i0.L(4.0f);
            return;
        }
        int i13 = this.j;
        if (this.f == null && !this.i && this.g == null) {
            i11 = org.telegram.messenger.i0.L(6.0f);
        }
        this.j = q1.I1(this.h) + i11 + i13;
    }
}

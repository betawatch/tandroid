package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class gv extends org.telegram.ui.Components.ng0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv(u91 u91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = u91Var;
    }

    @Override // org.telegram.ui.Components.ng0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((xw) this.g0).a.getViewOffset();
            default:
                return ((u91) this.g0).O.m3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv(String str, String str2, xw xwVar) {
        super(str, str2);
        this.g0 = xwVar;
    }
}

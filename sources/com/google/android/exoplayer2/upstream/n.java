package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class n extends IOException {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public n(int i10) {
        this.a = i10;
    }

    public n(Exception exc, int i10) {
        super(exc);
        this.a = i10;
    }

    public n(String str, int i10) {
        super(str);
        this.a = i10;
    }

    public n(String str, Exception exc, int i10) {
        super(str, exc);
        this.a = i10;
    }
}

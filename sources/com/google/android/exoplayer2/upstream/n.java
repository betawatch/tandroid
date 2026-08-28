package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class n extends IOException {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public n(int i9) {
        this.a = i9;
    }

    public n(Exception exc, int i9) {
        super(exc);
        this.a = i9;
    }

    public n(String str, int i9) {
        super(str);
        this.a = i9;
    }

    public n(String str, Exception exc, int i9) {
        super(str, exc);
        this.a = i9;
    }
}

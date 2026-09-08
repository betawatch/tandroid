package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public enum wc {
    d(R.raw.ic_download, 2, "Box", "Arrow"),
    e(R.raw.ic_save_to_gallery, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    f(R.raw.ic_save_to_music, 2, "Box", "Arrow"),
    h(R.raw.ic_save_to_gifs, 0, "gif");

    public final int a;
    public final String[] b;
    public final int c;

    wc(int i10, int i11, String... strArr) {
        this.a = i10;
        this.c = i11;
        this.b = strArr;
    }
}

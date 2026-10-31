package org.telegram.ui.Components;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public enum ac {
    d(R.raw.ic_download, 2, "Box", "Arrow"),
    e(R.raw.ic_save_to_gallery, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    f(R.raw.ic_save_to_music, 2, "Box", "Arrow"),
    h(R.raw.ic_save_to_gifs, 0, "gif");

    public final int a;
    public final String[] b;
    public final int c;

    ac(int i10, int i11, String... strArr) {
        this.a = i10;
        this.c = i11;
        this.b = strArr;
    }
}

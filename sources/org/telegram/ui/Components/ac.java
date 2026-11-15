package org.telegram.ui.Components;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public enum ac {
    d(R.raw.ic_download, 2, "Box", "Arrow"),
    e(R.raw.ic_save_to_gallery, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    f(R.raw.ic_save_to_music, 2, "Box", "Arrow"),
    h(R.raw.ic_save_to_gifs, 0, "gif");

    public final int a;
    public final String[] b;
    public final int c;

    ac(int i7, int i10, String... strArr) {
        this.a = i7;
        this.c = i10;
        this.b = strArr;
    }
}

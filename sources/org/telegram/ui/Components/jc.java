package org.telegram.ui.Components;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public enum jc {
    d(R.raw.ic_download, 2, "Box", "Arrow"),
    e(R.raw.ic_save_to_gallery, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    f(R.raw.ic_save_to_music, 2, "Box", "Arrow"),
    h(R.raw.ic_save_to_gifs, 0, "gif");

    public final int a;
    public final String[] b;
    public final int c;

    jc(int i7, int i10, String... strArr) {
        this.a = i7;
        this.c = i10;
        this.b = strArr;
    }
}

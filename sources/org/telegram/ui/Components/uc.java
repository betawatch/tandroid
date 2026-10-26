package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public enum uc {
    d(R.raw.ic_download, 2, "Box", "Arrow"),
    e(R.raw.ic_save_to_gallery, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    f(R.raw.ic_save_to_music, 2, "Box", "Arrow"),
    h(R.raw.ic_save_to_gifs, 0, "gif");

    public final int a;
    public final String[] b;
    public final int c;

    uc(int i10, int i11, String... strArr) {
        this.a = i10;
        this.c = i11;
        this.b = strArr;
    }
}

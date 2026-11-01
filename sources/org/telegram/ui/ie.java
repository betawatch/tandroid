package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ie {
    public String b;
    public CharSequence c;
    public long d;
    public long e;
    public String f;
    public boolean g;
    public String h;
    public long j;
    public boolean a = true;
    public TL_stars.StarsAmount i = TL_stars.StarsAmount.ofStars(0);

    public static ie a(String str, String str2) {
        ie ieVar = new ie();
        ieVar.b = str;
        ieVar.c = str2;
        return ieVar;
    }
}

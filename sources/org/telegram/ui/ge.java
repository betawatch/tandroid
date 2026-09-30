package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ge {
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

    public static ge a(String str, String str2) {
        ge geVar = new ge();
        geVar.b = str;
        geVar.c = str2;
        return geVar;
    }
}

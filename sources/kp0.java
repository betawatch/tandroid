// default package

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kp0 extends ja {
    public final String c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f;
    public final int g;

    public kp0(TL_stories.Boost boost, boolean z, int i) {
        super(5, true);
        this.d = boost;
        this.f = z;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z = this.f;
        if (this == obj) {
            return true;
        }
        if (obj == null || kp0.class != obj.getClass()) {
            return false;
        }
        kp0 kp0Var = (kp0) obj;
        TL_stories.Boost boost = kp0Var.d;
        boolean z2 = kp0Var.f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = kp0Var.e) != null) {
            return prepaidGiveaway2.id == prepaidGiveaway.id && z == z2;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        return boost2.id.hashCode() == boost.id.hashCode() && z == z2 && this.g == kp0Var.g;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g));
    }

    public kp0(int i, String str) {
        super(i, false);
        this.c = str;
    }
}

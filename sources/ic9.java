// default package

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ic9 {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public ic9(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.a = colorStateList;
        this.b = configuration;
        this.c = theme == null ? 0 : theme.hashCode();
    }
}

package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class DepthLimitExceededException extends ParseException {
    private static final long serialVersionUID = 1;

    public DepthLimitExceededException() {
        super("Maximum formula nesting depth exceeded");
    }
}

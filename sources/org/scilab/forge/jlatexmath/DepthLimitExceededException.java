package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public class DepthLimitExceededException extends ParseException {
    private static final long serialVersionUID = 1;

    public DepthLimitExceededException() {
        super("Maximum formula nesting depth exceeded");
    }
}

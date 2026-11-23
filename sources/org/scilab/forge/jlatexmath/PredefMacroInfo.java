package org.scilab.forge.jlatexmath;

import org.telegram.messenger.ls;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
class PredefMacroInfo extends MacroInfo {
    private int id;

    public PredefMacroInfo(int i7, int i10, int i11) {
        super(i10, i11);
        this.id = i7;
    }

    private static final Object invokeID(int i7, TeXParser teXParser, String[] strArr) {
        try {
            switch (i7) {
                case 0:
                    return PredefMacros.newcommand_macro(teXParser, strArr);
                case 1:
                    return PredefMacros.renewcommand_macro(teXParser, strArr);
                case 2:
                    return PredefMacros.rule_macro(teXParser, strArr);
                case 3:
                case 4:
                    return PredefMacros.hvspace_macro(teXParser, strArr);
                case 5:
                case 6:
                case 7:
                    return PredefMacros.clrlap_macro(teXParser, strArr);
                case 8:
                case 9:
                case 10:
                    return PredefMacros.mathclrlap_macro(teXParser, strArr);
                case 11:
                    return PredefMacros.includegraphics_macro(teXParser, strArr);
                case 12:
                    return PredefMacros.cfrac_macro(teXParser, strArr);
                case 13:
                    return PredefMacros.frac_macro(teXParser, strArr);
                case 14:
                    return PredefMacros.sfrac_macro(teXParser, strArr);
                case 15:
                    return PredefMacros.genfrac_macro(teXParser, strArr);
                case 16:
                    return PredefMacros.over_macro(teXParser, strArr);
                case 17:
                    return PredefMacros.overwithdelims_macro(teXParser, strArr);
                case 18:
                    return PredefMacros.atop_macro(teXParser, strArr);
                case 19:
                    return PredefMacros.atopwithdelims_macro(teXParser, strArr);
                case 20:
                    return PredefMacros.choose_macro(teXParser, strArr);
                case 21:
                    return PredefMacros.underscore_macro(teXParser, strArr);
                case 22:
                    return PredefMacros.mbox_macro(teXParser, strArr);
                case 23:
                    return PredefMacros.text_macro(teXParser, strArr);
                case 24:
                    return PredefMacros.intertext_macro(teXParser, strArr);
                case 25:
                    return PredefMacros.binom_macro(teXParser, strArr);
                case 26:
                    return PredefMacros.mathbf_macro(teXParser, strArr);
                case 27:
                    return PredefMacros.bf_macro(teXParser, strArr);
                case 28:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 29:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case ls.T /* 30 */:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case ls.U /* 31 */:
                    return PredefMacros.mathit_macro(teXParser, strArr);
                case 32:
                    return PredefMacros.it_macro(teXParser, strArr);
                case 33:
                    return PredefMacros.mathrm_macro(teXParser, strArr);
                case 34:
                    return PredefMacros.rm_macro(teXParser, strArr);
                case 35:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 36:
                    return PredefMacros.mathsf_macro(teXParser, strArr);
                case 37:
                    return PredefMacros.sf_macro(teXParser, strArr);
                case 38:
                    return PredefMacros.mathtt_macro(teXParser, strArr);
                case 39:
                    return PredefMacros.tt_macro(teXParser, strArr);
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case ls.o0 /* 51 */:
                case ls.p0 /* 52 */:
                case ls.q0 /* 53 */:
                case ls.r0 /* 54 */:
                case ls.s0 /* 55 */:
                case ls.t0 /* 56 */:
                case ls.u0 /* 57 */:
                    return PredefMacros.accentbis_macros(teXParser, strArr);
                case ls.v0 /* 58 */:
                    return PredefMacros.T_macro(teXParser, strArr);
                case ls.w0 /* 59 */:
                    return PredefMacros.accentbis_macros(teXParser, strArr);
                case ls.x0 /* 60 */:
                    return PredefMacros.accent_macro(teXParser, strArr);
                case ls.y0 /* 61 */:
                    return PredefMacros.grkaccent_macro(teXParser, strArr);
                case ls.z0 /* 62 */:
                case ls.A0 /* 63 */:
                case 64:
                case 65:
                case ls.D0 /* 66 */:
                case ls.E0 /* 67 */:
                case ls.F0 /* 68 */:
                case ls.G0 /* 69 */:
                case ls.H0 /* 70 */:
                case ls.I0 /* 71 */:
                case ls.J0 /* 72 */:
                case ls.K0 /* 73 */:
                case ls.L0 /* 74 */:
                case ls.M0 /* 75 */:
                    return PredefMacros.accent_macros(teXParser, strArr);
                case ls.N0 /* 76 */:
                    return PredefMacros.nbsp_macro(teXParser, strArr);
                case ls.O0 /* 77 */:
                    return PredefMacros.smallmatrixATATenv_macro(teXParser, strArr);
                case ls.P0 /* 78 */:
                    return PredefMacros.matrixATATenv_macro(teXParser, strArr);
                case ls.Q0 /* 79 */:
                    return PredefMacros.overrightarrow_macro(teXParser, strArr);
                case 80:
                    return PredefMacros.overleftarrow_macro(teXParser, strArr);
                case ls.S0 /* 81 */:
                    return PredefMacros.overleftrightarrow_macro(teXParser, strArr);
                case ls.T0 /* 82 */:
                    return PredefMacros.underrightarrow_macro(teXParser, strArr);
                case ls.U0 /* 83 */:
                    return PredefMacros.underleftarrow_macro(teXParser, strArr);
                case ls.V0 /* 84 */:
                    return PredefMacros.underleftrightarrow_macro(teXParser, strArr);
                case ls.W0 /* 85 */:
                    return PredefMacros.xleftarrow_macro(teXParser, strArr);
                case ls.X0 /* 86 */:
                    return PredefMacros.xrightarrow_macro(teXParser, strArr);
                case ls.Y0 /* 87 */:
                    return PredefMacros.underbrace_macro(teXParser, strArr);
                case ls.Z0 /* 88 */:
                    return PredefMacros.overbrace_macro(teXParser, strArr);
                case ls.a1 /* 89 */:
                    return PredefMacros.underbrack_macro(teXParser, strArr);
                case ls.b1 /* 90 */:
                    return PredefMacros.overbrack_macro(teXParser, strArr);
                case ls.c1 /* 91 */:
                    return PredefMacros.underparen_macro(teXParser, strArr);
                case ls.d1 /* 92 */:
                    return PredefMacros.overparen_macro(teXParser, strArr);
                case ls.e1 /* 93 */:
                case ls.f1 /* 94 */:
                    return PredefMacros.sqrt_macro(teXParser, strArr);
                case ls.g1 /* 95 */:
                    return PredefMacros.overline_macro(teXParser, strArr);
                case 96:
                    return PredefMacros.underline_macro(teXParser, strArr);
                case ls.i1 /* 97 */:
                    return PredefMacros.mathop_macro(teXParser, strArr);
                case ls.j1 /* 98 */:
                    return PredefMacros.mathpunct_macro(teXParser, strArr);
                case ls.k1 /* 99 */:
                    return PredefMacros.mathord_macro(teXParser, strArr);
                case ls.l1 /* 100 */:
                    return PredefMacros.mathrel_macro(teXParser, strArr);
                case 101:
                    return PredefMacros.mathinner_macro(teXParser, strArr);
                case ls.n1 /* 102 */:
                    return PredefMacros.mathbin_macro(teXParser, strArr);
                case ls.o1 /* 103 */:
                    return PredefMacros.mathopen_macro(teXParser, strArr);
                case ls.p1 /* 104 */:
                    return PredefMacros.mathclose_macro(teXParser, strArr);
                case ls.q1 /* 105 */:
                    return PredefMacros.joinrel_macro(teXParser, strArr);
                case ls.r1 /* 106 */:
                    return PredefMacros.smash_macro(teXParser, strArr);
                case ls.s1 /* 107 */:
                    return PredefMacros.vdots_macro(teXParser, strArr);
                case ls.t1 /* 108 */:
                    return PredefMacros.ddots_macro(teXParser, strArr);
                case ls.u1 /* 109 */:
                    return PredefMacros.iddots_macro(teXParser, strArr);
                case ls.v1 /* 110 */:
                    return PredefMacros.nolimits_macro(teXParser, strArr);
                case ls.w1 /* 111 */:
                    return PredefMacros.limits_macro(teXParser, strArr);
                case ls.x1 /* 112 */:
                    return PredefMacros.normal_macro(teXParser, strArr);
                case ls.y1 /* 113 */:
                    return PredefMacros.leftparenthesis_macro(teXParser, strArr);
                case ls.z1 /* 114 */:
                    return PredefMacros.leftbracket_macro(teXParser, strArr);
                case ls.A1 /* 115 */:
                    return PredefMacros.left_macro(teXParser, strArr);
                case ls.B1 /* 116 */:
                    return PredefMacros.middle_macro(teXParser, strArr);
                case ls.C1 /* 117 */:
                    return PredefMacros.cr_macro(teXParser, strArr);
                case ls.D1 /* 118 */:
                    return PredefMacros.multicolumn_macro(teXParser, strArr);
                case ls.E1 /* 119 */:
                    return PredefMacros.hdotsfor_macro(teXParser, strArr);
                case 120:
                    return PredefMacros.arrayATATenv_macro(teXParser, strArr);
                case ls.F1 /* 121 */:
                    return PredefMacros.alignATATenv_macro(teXParser, strArr);
                case ls.G1 /* 122 */:
                    return PredefMacros.alignedATATenv_macro(teXParser, strArr);
                case ls.H1 /* 123 */:
                    return PredefMacros.flalignATATenv_macro(teXParser, strArr);
                case ls.I1 /* 124 */:
                    return PredefMacros.alignatATATenv_macro(teXParser, strArr);
                case ls.J1 /* 125 */:
                    return PredefMacros.alignedatATATenv_macro(teXParser, strArr);
                case ls.K1 /* 126 */:
                    return PredefMacros.multlineATATenv_macro(teXParser, strArr);
                case ls.L1 /* 127 */:
                    return PredefMacros.gatherATATenv_macro(teXParser, strArr);
                case 128:
                    return PredefMacros.gatheredATATenv_macro(teXParser, strArr);
                case ls.N1 /* 129 */:
                    return PredefMacros.shoveright_macro(teXParser, strArr);
                case ls.O1 /* 130 */:
                    return PredefMacros.shoveleft_macro(teXParser, strArr);
                case ls.P1 /* 131 */:
                    return PredefMacros.backslashcr_macro(teXParser, strArr);
                case ls.Q1 /* 132 */:
                    return PredefMacros.newenvironment_macro(teXParser, strArr);
                case 133:
                    return PredefMacros.renewenvironment_macro(teXParser, strArr);
                case 134:
                    return PredefMacros.makeatletter_macro(teXParser, strArr);
                case ls.R1 /* 135 */:
                    return PredefMacros.makeatother_macro(teXParser, strArr);
                case ls.S1 /* 136 */:
                case ls.T1 /* 137 */:
                    return PredefMacros.fbox_macro(teXParser, strArr);
                case ls.U1 /* 138 */:
                    return PredefMacros.stackrel_macro(teXParser, strArr);
                case ls.V1 /* 139 */:
                    return PredefMacros.stackbin_macro(teXParser, strArr);
                case ls.W1 /* 140 */:
                    return PredefMacros.accentset_macro(teXParser, strArr);
                case ls.X1 /* 141 */:
                    return PredefMacros.underaccent_macro(teXParser, strArr);
                case ls.Y1 /* 142 */:
                    return PredefMacros.undertilde_macro(teXParser, strArr);
                case ls.Z1 /* 143 */:
                    return PredefMacros.overset_macro(teXParser, strArr);
                case ls.a2 /* 144 */:
                    return PredefMacros.Braket_macro(teXParser, strArr);
                case ls.b2 /* 145 */:
                    return PredefMacros.Set_macro(teXParser, strArr);
                case ls.c2 /* 146 */:
                    return PredefMacros.underset_macro(teXParser, strArr);
                case ls.d2 /* 147 */:
                    return PredefMacros.boldsymbol_macro(teXParser, strArr);
                case ls.e2 /* 148 */:
                    return PredefMacros.LaTeX_macro(teXParser, strArr);
                case ls.f2 /* 149 */:
                    return PredefMacros.GeoGebra_macro(teXParser, strArr);
                case ls.g2 /* 150 */:
                    return PredefMacros.big_macro(teXParser, strArr);
                case ls.h2 /* 151 */:
                    return PredefMacros.Big_macro(teXParser, strArr);
                case ls.i2 /* 152 */:
                    return PredefMacros.bigg_macro(teXParser, strArr);
                case ls.j2 /* 153 */:
                    return PredefMacros.Bigg_macro(teXParser, strArr);
                case ls.k2 /* 154 */:
                    return PredefMacros.bigl_macro(teXParser, strArr);
                case ls.l2 /* 155 */:
                    return PredefMacros.Bigl_macro(teXParser, strArr);
                case ls.m2 /* 156 */:
                    return PredefMacros.biggl_macro(teXParser, strArr);
                case ls.n2 /* 157 */:
                    return PredefMacros.Biggl_macro(teXParser, strArr);
                case ls.o2 /* 158 */:
                    return PredefMacros.bigr_macro(teXParser, strArr);
                case ls.p2 /* 159 */:
                    return PredefMacros.Bigr_macro(teXParser, strArr);
                case ls.q2 /* 160 */:
                    return PredefMacros.biggr_macro(teXParser, strArr);
                case ls.r2 /* 161 */:
                    return PredefMacros.Biggr_macro(teXParser, strArr);
                case ls.s2 /* 162 */:
                    return PredefMacros.displaystyle_macro(teXParser, strArr);
                case ls.t2 /* 163 */:
                    return PredefMacros.textstyle_macro(teXParser, strArr);
                case ls.u2 /* 164 */:
                    return PredefMacros.scriptstyle_macro(teXParser, strArr);
                case ls.v2 /* 165 */:
                    return PredefMacros.scriptscriptstyle_macro(teXParser, strArr);
                case ls.w2 /* 166 */:
                    return PredefMacros.sideset_macro(teXParser, strArr);
                case ls.x2 /* 167 */:
                    return PredefMacros.prescript_macro(teXParser, strArr);
                case ls.y2 /* 168 */:
                    return PredefMacros.rotatebox_macro(teXParser, strArr);
                case ls.z2 /* 169 */:
                    return PredefMacros.reflectbox_macro(teXParser, strArr);
                case ls.A2 /* 170 */:
                    return PredefMacros.scalebox_macro(teXParser, strArr);
                case ls.B2 /* 171 */:
                    return PredefMacros.resizebox_macro(teXParser, strArr);
                case ls.C2 /* 172 */:
                    return PredefMacros.raisebox_macro(teXParser, strArr);
                case ls.D2 /* 173 */:
                    return PredefMacros.shadowbox_macro(teXParser, strArr);
                case ls.E2 /* 174 */:
                    return PredefMacros.ovalbox_macro(teXParser, strArr);
                case ls.F2 /* 175 */:
                    return PredefMacros.doublebox_macro(teXParser, strArr);
                case ls.G2 /* 176 */:
                    return PredefMacros.phantom_macro(teXParser, strArr);
                case ls.H2 /* 177 */:
                    return PredefMacros.hphantom_macro(teXParser, strArr);
                case ls.I2 /* 178 */:
                    return PredefMacros.vphantom_macro(teXParser, strArr);
                case ls.J2 /* 179 */:
                    return PredefMacros.spATbreve_macro(teXParser, strArr);
                case ls.K2 /* 180 */:
                    return PredefMacros.spAThat_macro(teXParser, strArr);
                case ls.L2 /* 181 */:
                    return PredefMacros.definecolor_macro(teXParser, strArr);
                case ls.M2 /* 182 */:
                    return PredefMacros.textcolor_macro(teXParser, strArr);
                case ls.N2 /* 183 */:
                    return PredefMacros.fgcolor_macro(teXParser, strArr);
                case ls.O2 /* 184 */:
                    return PredefMacros.bgcolor_macro(teXParser, strArr);
                case ls.P2 /* 185 */:
                    return PredefMacros.colorbox_macro(teXParser, strArr);
                case ls.Q2 /* 186 */:
                    return PredefMacros.fcolorbox_macro(teXParser, strArr);
                case ls.R2 /* 187 */:
                    return PredefMacros.cedilla_macro(teXParser, strArr);
                case ls.S2 /* 188 */:
                    return PredefMacros.IJ_macro(teXParser, strArr);
                case ls.T2 /* 189 */:
                    return PredefMacros.IJ_macro(teXParser, strArr);
                case ls.U2 /* 190 */:
                    return PredefMacros.TStroke_macro(teXParser, strArr);
                case ls.V2 /* 191 */:
                    return PredefMacros.TStroke_macro(teXParser, strArr);
                case ls.W2 /* 192 */:
                    return PredefMacros.LCaron_macro(teXParser, strArr);
                case ls.X2 /* 193 */:
                    return PredefMacros.tcaron_macro(teXParser, strArr);
                case ls.Y2 /* 194 */:
                    return PredefMacros.LCaron_macro(teXParser, strArr);
                case ls.Z2 /* 195 */:
                    return PredefMacros.ogonek_macro(teXParser, strArr);
                case ls.a3 /* 196 */:
                    return PredefMacros.cong_macro(teXParser, strArr);
                case ls.b3 /* 197 */:
                    return PredefMacros.doteq_macro(teXParser, strArr);
                case ls.c3 /* 198 */:
                    return PredefMacros.jlmDynamic_macro(teXParser, strArr);
                case ls.d3 /* 199 */:
                    return PredefMacros.jlmExternalFont_macro(teXParser, strArr);
                case ls.e3 /* 200 */:
                    return PredefMacros.jlmText_macro(teXParser, strArr);
                case ls.f3 /* 201 */:
                    return PredefMacros.jlmTextit_macro(teXParser, strArr);
                case ls.g3 /* 202 */:
                    return PredefMacros.jlmTextbf_macro(teXParser, strArr);
                case 203:
                    return PredefMacros.jlmTextitbf_macro(teXParser, strArr);
                case ls.i3 /* 204 */:
                    return PredefMacros.DeclareMathSizes_macro(teXParser, strArr);
                case ls.j3 /* 205 */:
                    return PredefMacros.magnification_macro(teXParser, strArr);
                case ls.k3 /* 206 */:
                    return PredefMacros.hline_macro(teXParser, strArr);
                case ls.l3 /* 207 */:
                case ls.m3 /* 208 */:
                case ls.n3 /* 209 */:
                case 210:
                case ls.o3 /* 211 */:
                case ls.p3 /* 212 */:
                case ls.q3 /* 213 */:
                case ls.r3 /* 214 */:
                case ls.s3 /* 215 */:
                case ls.t3 /* 216 */:
                    return PredefMacros.size_macros(teXParser, strArr);
                case ls.u3 /* 217 */:
                    return PredefMacros.jlatexmathcumsup_macro(teXParser, strArr);
                case ls.v3 /* 218 */:
                    return PredefMacros.jlatexmathcumsub_macro(teXParser, strArr);
                case ls.w3 /* 219 */:
                    return PredefMacros.hstrok_macro(teXParser, strArr);
                case ls.x3 /* 220 */:
                    return PredefMacros.Hstrok_macro(teXParser, strArr);
                case ls.y3 /* 221 */:
                    return PredefMacros.dstrok_macro(teXParser, strArr);
                case ls.z3 /* 222 */:
                    return PredefMacros.Dstrok_macro(teXParser, strArr);
                case ls.A3 /* 223 */:
                    return PredefMacros.dotminus_macro(teXParser, strArr);
                case ls.B3 /* 224 */:
                    return PredefMacros.ratio_macro(teXParser, strArr);
                case ls.C3 /* 225 */:
                    return PredefMacros.smallfrowneq_macro(teXParser, strArr);
                case ls.D3 /* 226 */:
                    return PredefMacros.geoprop_macro(teXParser, strArr);
                case ls.E3 /* 227 */:
                    return PredefMacros.minuscolon_macro(teXParser, strArr);
                case ls.F3 /* 228 */:
                    return PredefMacros.minuscoloncolon_macro(teXParser, strArr);
                case 229:
                    return PredefMacros.simcolon_macro(teXParser, strArr);
                case ls.G3 /* 230 */:
                    return PredefMacros.simcoloncolon_macro(teXParser, strArr);
                case ls.H3 /* 231 */:
                    return PredefMacros.approxcolon_macro(teXParser, strArr);
                case ls.I3 /* 232 */:
                    return PredefMacros.approxcoloncolon_macro(teXParser, strArr);
                case ls.J3 /* 233 */:
                    return PredefMacros.coloncolon_macro(teXParser, strArr);
                case 234:
                    return PredefMacros.equalscolon_macro(teXParser, strArr);
                case ls.L3 /* 235 */:
                    return PredefMacros.equalscoloncolon_macro(teXParser, strArr);
                case 236:
                    return PredefMacros.colonminus_macro(teXParser, strArr);
                case ls.M3 /* 237 */:
                    return PredefMacros.coloncolonminus_macro(teXParser, strArr);
                case ls.N3 /* 238 */:
                    return PredefMacros.colonequals_macro(teXParser, strArr);
                case ls.O3 /* 239 */:
                    return PredefMacros.coloncolonequals_macro(teXParser, strArr);
                case ls.P3 /* 240 */:
                    return PredefMacros.colonsim_macro(teXParser, strArr);
                case ls.Q3 /* 241 */:
                    return PredefMacros.coloncolonsim_macro(teXParser, strArr);
                case ls.R3 /* 242 */:
                    return PredefMacros.colonapprox_macro(teXParser, strArr);
                case ls.S3 /* 243 */:
                    return PredefMacros.coloncolonapprox_macro(teXParser, strArr);
                case ls.T3 /* 244 */:
                    return PredefMacros.kern_macro(teXParser, strArr);
                case ls.U3 /* 245 */:
                    return PredefMacros.char_macro(teXParser, strArr);
                case ls.V3 /* 246 */:
                case ls.W3 /* 247 */:
                    return PredefMacros.romannumeral_macro(teXParser, strArr);
                case ls.X3 /* 248 */:
                    return PredefMacros.textcircled_macro(teXParser, strArr);
                case ls.Y3 /* 249 */:
                    return PredefMacros.textsc_macro(teXParser, strArr);
                case ls.Z3 /* 250 */:
                    return PredefMacros.sc_macro(teXParser, strArr);
                case ls.a4 /* 251 */:
                case ls.b4 /* 252 */:
                case ls.c4 /* 253 */:
                case ls.d4 /* 254 */:
                case ls.e4 /* 255 */:
                case 256:
                case ls.g4 /* 257 */:
                case ls.h4 /* 258 */:
                case ls.i4 /* 259 */:
                case ls.j4 /* 260 */:
                    return PredefMacros.muskip_macros(teXParser, strArr);
                case ls.k4 /* 261 */:
                    return PredefMacros.quad_macro(teXParser, strArr);
                case ls.l4 /* 262 */:
                    return PredefMacros.surd_macro(teXParser, strArr);
                case ls.m4 /* 263 */:
                    return PredefMacros.iint_macro(teXParser, strArr);
                case ls.n4 /* 264 */:
                    return PredefMacros.iiint_macro(teXParser, strArr);
                case ls.o4 /* 265 */:
                    return PredefMacros.iiiint_macro(teXParser, strArr);
                case ls.p4 /* 266 */:
                    return PredefMacros.idotsint_macro(teXParser, strArr);
                case ls.q4 /* 267 */:
                    return PredefMacros.int_macro(teXParser, strArr);
                case ls.r4 /* 268 */:
                    return PredefMacros.oint_macro(teXParser, strArr);
                case ls.s4 /* 269 */:
                    return PredefMacros.lmoustache_macro(teXParser, strArr);
                case ls.t4 /* 270 */:
                    return PredefMacros.rmoustache_macro(teXParser, strArr);
                case ls.u4 /* 271 */:
                    return PredefMacros.insertBreakMark_macro(teXParser, strArr);
                case ls.v4 /* 272 */:
                    return PredefMacros.jlmXML_macro(teXParser, strArr);
                case ls.w4 /* 273 */:
                    return PredefMacros.above_macro(teXParser, strArr);
                case ls.x4 /* 274 */:
                    return PredefMacros.abovewithdelims_macro(teXParser, strArr);
                case ls.y4 /* 275 */:
                    return PredefMacros.st_macro(teXParser, strArr);
                case ls.z4 /* 276 */:
                    return PredefMacros.fcscore_macro(teXParser, strArr);
                case ls.A4 /* 277 */:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case ls.B4 /* 278 */:
                    return PredefMacros.qquad_macro(teXParser, strArr);
                case ls.C4 /* 279 */:
                    return PredefMacros.longdiv_macro(teXParser, strArr);
                case ls.D4 /* 280 */:
                    return PredefMacros.questeq_macro(teXParser, strArr);
                case ls.E4 /* 281 */:
                    return PredefMacros.bangle_macro(teXParser, strArr);
                case ls.F4 /* 282 */:
                    return PredefMacros.brace_macro(teXParser, strArr);
                case ls.G4 /* 283 */:
                    return PredefMacros.brack_macro(teXParser, strArr);
                default:
                    return null;
            }
        } catch (Exception e10) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n" + e10.getMessage());
        }
    }

    @Override // org.scilab.forge.jlatexmath.MacroInfo
    public Object invoke(TeXParser teXParser, String[] strArr) {
        return invokeID(this.id, teXParser, strArr);
    }

    public PredefMacroInfo(int i7, int i10) {
        super(i10);
        this.id = i7;
    }
}
